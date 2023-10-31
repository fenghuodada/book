package androidx.fragment.app;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.AbstractC1464h;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BackStackRecord extends FragmentTransaction implements FragmentManager.BackStackEntry, FragmentManager.OpGenerator {
    private static final String TAG = "FragmentManager";
    boolean mBeingSaved;
    boolean mCommitted;
    int mIndex;
    final FragmentManager mManager;

    public BackStackRecord(@NonNull BackStackRecord backStackRecord) {
        super(backStackRecord.mManager.getFragmentFactory(), backStackRecord.mManager.getHost() != null ? backStackRecord.mManager.getHost().getContext().getClassLoader() : null, backStackRecord);
        this.mIndex = -1;
        this.mBeingSaved = false;
        this.mManager = backStackRecord.mManager;
        this.mCommitted = backStackRecord.mCommitted;
        this.mIndex = backStackRecord.mIndex;
        this.mBeingSaved = backStackRecord.mBeingSaved;
    }

    public BackStackRecord(@NonNull FragmentManager fragmentManager) {
        super(fragmentManager.getFragmentFactory(), fragmentManager.getHost() != null ? fragmentManager.getHost().getContext().getClassLoader() : null);
        this.mIndex = -1;
        this.mBeingSaved = false;
        this.mManager = fragmentManager;
    }

    public void bumpBackStackNesting(int i) {
        FragmentTransaction.C1386Op c1386Op;
        if (this.mAddToBackStack) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.mOps.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = this.mOps.get(i2).mFragment;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c1386Op.mFragment + " to " + c1386Op.mFragment.mBackStackNesting);
                    }
                }
            }
        }
    }

    public void collapseOps() {
        int size = this.mOps.size() - 1;
        while (size >= 0) {
            FragmentTransaction.C1386Op c1386Op = this.mOps.get(size);
            if (c1386Op.mFromExpandedOp) {
                if (c1386Op.mCmd == 8) {
                    c1386Op.mFromExpandedOp = false;
                    this.mOps.remove(size - 1);
                    size--;
                } else {
                    int i = c1386Op.mFragment.mContainerId;
                    c1386Op.mCmd = 2;
                    c1386Op.mFromExpandedOp = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        FragmentTransaction.C1386Op c1386Op2 = this.mOps.get(i2);
                        if (c1386Op2.mFromExpandedOp && c1386Op2.mFragment.mContainerId == i) {
                            this.mOps.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public int commit() {
        return commitInternal(false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public int commitAllowingStateLoss() {
        return commitInternal(true);
    }

    public int commitInternal(boolean z) {
        if (this.mCommitted) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new LogWriter("FragmentManager"));
            dump("  ", printWriter);
            printWriter.close();
        }
        this.mCommitted = true;
        this.mIndex = this.mAddToBackStack ? this.mManager.allocBackStackIndex() : -1;
        this.mManager.enqueueAction(this, z);
        return this.mIndex;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void commitNow() {
        disallowAddToBackStack();
        this.mManager.execSingleAction(this, false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void commitNowAllowingStateLoss() {
        disallowAddToBackStack();
        this.mManager.execSingleAction(this, true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @NonNull
    public FragmentTransaction detach(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.mManager) {
            return super.detach(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void doAddOp(int i, Fragment fragment, @Nullable String str, int i2) {
        super.doAddOp(i, fragment, str, i2);
        fragment.mFragmentManager = this.mManager;
    }

    public void dump(String str, PrintWriter printWriter) {
        dump(str, printWriter, true);
    }

    public void dump(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.mName);
            printWriter.print(" mIndex=");
            printWriter.print(this.mIndex);
            printWriter.print(" mCommitted=");
            printWriter.println(this.mCommitted);
            if (this.mTransition != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.mTransition));
            }
            if (this.mEnterAnim != 0 || this.mExitAnim != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.mEnterAnim));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.mExitAnim));
            }
            if (this.mPopEnterAnim != 0 || this.mPopExitAnim != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.mPopEnterAnim));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.mPopExitAnim));
            }
            if (this.mBreadCrumbTitleRes != 0 || this.mBreadCrumbTitleText != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.mBreadCrumbTitleRes));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.mBreadCrumbTitleText);
            }
            if (this.mBreadCrumbShortTitleRes != 0 || this.mBreadCrumbShortTitleText != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.mBreadCrumbShortTitleRes));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.mBreadCrumbShortTitleText);
            }
        }
        if (this.mOps.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.mOps.size();
        for (int i = 0; i < size; i++) {
            FragmentTransaction.C1386Op c1386Op = this.mOps.get(i);
            switch (c1386Op.mCmd) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c1386Op.mCmd;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c1386Op.mFragment);
            if (z) {
                if (c1386Op.mEnterAnim != 0 || c1386Op.mExitAnim != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c1386Op.mEnterAnim));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c1386Op.mExitAnim));
                }
                if (c1386Op.mPopEnterAnim != 0 || c1386Op.mPopExitAnim != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c1386Op.mPopEnterAnim));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c1386Op.mPopExitAnim));
                }
            }
        }
    }

    public void executeOps() {
        FragmentManager fragmentManager;
        int size = this.mOps.size();
        for (int i = 0; i < size; i++) {
            FragmentTransaction.C1386Op c1386Op = this.mOps.get(i);
            Fragment fragment = c1386Op.mFragment;
            if (fragment != null) {
                fragment.mBeingSaved = this.mBeingSaved;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.mTransition);
                fragment.setSharedElementNames(this.mSharedElementSourceNames, this.mSharedElementTargetNames);
            }
            switch (c1386Op.mCmd) {
                case 1:
                    fragment.setAnimations(c1386Op.mEnterAnim, c1386Op.mExitAnim, c1386Op.mPopEnterAnim, c1386Op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(fragment, false);
                    this.mManager.addFragment(fragment);
                    continue;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c1386Op.mCmd);
                case 3:
                    fragment.setAnimations(c1386Op.mEnterAnim, c1386Op.mExitAnim, c1386Op.mPopEnterAnim, c1386Op.mPopExitAnim);
                    this.mManager.removeFragment(fragment);
                    continue;
                case 4:
                    fragment.setAnimations(c1386Op.mEnterAnim, c1386Op.mExitAnim, c1386Op.mPopEnterAnim, c1386Op.mPopExitAnim);
                    this.mManager.hideFragment(fragment);
                    continue;
                case 5:
                    fragment.setAnimations(c1386Op.mEnterAnim, c1386Op.mExitAnim, c1386Op.mPopEnterAnim, c1386Op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(fragment, false);
                    this.mManager.showFragment(fragment);
                    continue;
                case 6:
                    fragment.setAnimations(c1386Op.mEnterAnim, c1386Op.mExitAnim, c1386Op.mPopEnterAnim, c1386Op.mPopExitAnim);
                    this.mManager.detachFragment(fragment);
                    continue;
                case 7:
                    fragment.setAnimations(c1386Op.mEnterAnim, c1386Op.mExitAnim, c1386Op.mPopEnterAnim, c1386Op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(fragment, false);
                    this.mManager.attachFragment(fragment);
                    continue;
                case 8:
                    fragmentManager = this.mManager;
                    break;
                case 9:
                    fragmentManager = this.mManager;
                    fragment = null;
                    break;
                case 10:
                    this.mManager.setMaxLifecycle(fragment, c1386Op.mCurrentMaxState);
                    continue;
            }
            fragmentManager.setPrimaryNavigationFragment(fragment);
        }
    }

    public void executePopOps() {
        FragmentManager fragmentManager;
        for (int size = this.mOps.size() - 1; size >= 0; size--) {
            FragmentTransaction.C1386Op c1386Op = this.mOps.get(size);
            Fragment fragment = c1386Op.mFragment;
            if (fragment != null) {
                fragment.mBeingSaved = this.mBeingSaved;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.reverseTransit(this.mTransition));
                fragment.setSharedElementNames(this.mSharedElementTargetNames, this.mSharedElementSourceNames);
            }
            switch (c1386Op.mCmd) {
                case 1:
                    fragment.setAnimations(c1386Op.mEnterAnim, c1386Op.mExitAnim, c1386Op.mPopEnterAnim, c1386Op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(fragment, true);
                    this.mManager.removeFragment(fragment);
                    continue;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c1386Op.mCmd);
                case 3:
                    fragment.setAnimations(c1386Op.mEnterAnim, c1386Op.mExitAnim, c1386Op.mPopEnterAnim, c1386Op.mPopExitAnim);
                    this.mManager.addFragment(fragment);
                    continue;
                case 4:
                    fragment.setAnimations(c1386Op.mEnterAnim, c1386Op.mExitAnim, c1386Op.mPopEnterAnim, c1386Op.mPopExitAnim);
                    this.mManager.showFragment(fragment);
                    continue;
                case 5:
                    fragment.setAnimations(c1386Op.mEnterAnim, c1386Op.mExitAnim, c1386Op.mPopEnterAnim, c1386Op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(fragment, true);
                    this.mManager.hideFragment(fragment);
                    continue;
                case 6:
                    fragment.setAnimations(c1386Op.mEnterAnim, c1386Op.mExitAnim, c1386Op.mPopEnterAnim, c1386Op.mPopExitAnim);
                    this.mManager.attachFragment(fragment);
                    continue;
                case 7:
                    fragment.setAnimations(c1386Op.mEnterAnim, c1386Op.mExitAnim, c1386Op.mPopEnterAnim, c1386Op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(fragment, true);
                    this.mManager.detachFragment(fragment);
                    continue;
                case 8:
                    fragmentManager = this.mManager;
                    fragment = null;
                    break;
                case 9:
                    fragmentManager = this.mManager;
                    break;
                case 10:
                    this.mManager.setMaxLifecycle(fragment, c1386Op.mOldMaxState);
                    continue;
            }
            fragmentManager.setPrimaryNavigationFragment(fragment);
        }
    }

    public Fragment expandOps(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.mOps.size()) {
            FragmentTransaction.C1386Op c1386Op = this.mOps.get(i);
            int i2 = c1386Op.mCmd;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = c1386Op.mFragment;
                    int i3 = fragment3.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.mContainerId == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.mOps.add(i, new FragmentTransaction.C1386Op(9, fragment4, true));
                                    i++;
                                    fragment2 = null;
                                }
                                FragmentTransaction.C1386Op c1386Op2 = new FragmentTransaction.C1386Op(3, fragment4, true);
                                c1386Op2.mEnterAnim = c1386Op.mEnterAnim;
                                c1386Op2.mPopEnterAnim = c1386Op.mPopEnterAnim;
                                c1386Op2.mExitAnim = c1386Op.mExitAnim;
                                c1386Op2.mPopExitAnim = c1386Op.mPopExitAnim;
                                this.mOps.add(i, c1386Op2);
                                arrayList.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.mOps.remove(i);
                        i--;
                    } else {
                        c1386Op.mCmd = 1;
                        c1386Op.mFromExpandedOp = true;
                        arrayList.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(c1386Op.mFragment);
                    Fragment fragment5 = c1386Op.mFragment;
                    if (fragment5 == fragment2) {
                        this.mOps.add(i, new FragmentTransaction.C1386Op(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.mOps.add(i, new FragmentTransaction.C1386Op(9, fragment2, true));
                        c1386Op.mFromExpandedOp = true;
                        i++;
                        fragment2 = c1386Op.mFragment;
                    }
                }
                i++;
            }
            arrayList.add(c1386Op.mFragment);
            i++;
        }
        return fragment2;
    }

    @Override // androidx.fragment.app.FragmentManager.OpGenerator
    public boolean generateOps(@NonNull ArrayList<BackStackRecord> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.mAddToBackStack) {
            this.mManager.addBackStackState(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    @Nullable
    public CharSequence getBreadCrumbShortTitle() {
        return this.mBreadCrumbShortTitleRes != 0 ? this.mManager.getHost().getContext().getText(this.mBreadCrumbShortTitleRes) : this.mBreadCrumbShortTitleText;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getBreadCrumbShortTitleRes() {
        return this.mBreadCrumbShortTitleRes;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    @Nullable
    public CharSequence getBreadCrumbTitle() {
        return this.mBreadCrumbTitleRes != 0 ? this.mManager.getHost().getContext().getText(this.mBreadCrumbTitleRes) : this.mBreadCrumbTitleText;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getBreadCrumbTitleRes() {
        return this.mBreadCrumbTitleRes;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getId() {
        return this.mIndex;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    @Nullable
    public String getName() {
        return this.mName;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @NonNull
    public FragmentTransaction hide(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.mManager) {
            return super.hide(fragment);
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public boolean isEmpty() {
        return this.mOps.isEmpty();
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @NonNull
    public FragmentTransaction remove(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.mManager) {
            return super.remove(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public void runOnCommitRunnables() {
        if (this.mCommitRunnables != null) {
            for (int i = 0; i < this.mCommitRunnables.size(); i++) {
                this.mCommitRunnables.get(i).run();
            }
            this.mCommitRunnables = null;
        }
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @NonNull
    public FragmentTransaction setMaxLifecycle(@NonNull Fragment fragment, @NonNull AbstractC1464h.EnumC1468b enumC1468b) {
        if (fragment.mFragmentManager != this.mManager) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.mManager);
        } else if (enumC1468b == AbstractC1464h.EnumC1468b.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC1468b + " after the Fragment has been created");
        } else if (enumC1468b != AbstractC1464h.EnumC1468b.DESTROYED) {
            return super.setMaxLifecycle(fragment, enumC1468b);
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC1468b + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @NonNull
    public FragmentTransaction setPrimaryNavigationFragment(@Nullable Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.mFragmentManager) == null || fragmentManager == this.mManager) {
            return super.setPrimaryNavigationFragment(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @NonNull
    public FragmentTransaction show(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.mManager) {
            return super.show(fragment);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.mIndex >= 0) {
            sb.append(" #");
            sb.append(this.mIndex);
        }
        if (this.mName != null) {
            sb.append(" ");
            sb.append(this.mName);
        }
        sb.append("}");
        return sb.toString();
    }

    public Fragment trackAddedFragmentsInPop(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.mOps.size() - 1; size >= 0; size--) {
            FragmentTransaction.C1386Op c1386Op = this.mOps.get(size);
            int i = c1386Op.mCmd;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = c1386Op.mFragment;
                            break;
                        case 10:
                            c1386Op.mCurrentMaxState = c1386Op.mOldMaxState;
                            break;
                    }
                }
                arrayList.add(c1386Op.mFragment);
            }
            arrayList.remove(c1386Op.mFragment);
        }
        return fragment;
    }
}
