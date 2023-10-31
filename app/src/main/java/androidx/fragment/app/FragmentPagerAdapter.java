package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.AbstractC1464h;
import androidx.viewpager.widget.AbstractC1821a;

@Deprecated
/* loaded from: classes.dex */
public abstract class FragmentPagerAdapter extends AbstractC1821a {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;
    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentPagerAdapter";
    private final int mBehavior;
    private FragmentTransaction mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private boolean mExecutingFinishUpdate;
    private final FragmentManager mFragmentManager;

    @Deprecated
    public FragmentPagerAdapter(@NonNull FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    public FragmentPagerAdapter(@NonNull FragmentManager fragmentManager, int i) {
        this.mCurTransaction = null;
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = fragmentManager;
        this.mBehavior = i;
    }

    private static String makeFragmentName(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // androidx.viewpager.widget.AbstractC1821a
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.beginTransaction();
        }
        this.mCurTransaction.detach(fragment);
        if (fragment.equals(this.mCurrentPrimaryItem)) {
            this.mCurrentPrimaryItem = null;
        }
    }

    @Override // androidx.viewpager.widget.AbstractC1821a
    public void finishUpdate(@NonNull ViewGroup viewGroup) {
        FragmentTransaction fragmentTransaction = this.mCurTransaction;
        if (fragmentTransaction != null) {
            if (!this.mExecutingFinishUpdate) {
                try {
                    this.mExecutingFinishUpdate = true;
                    fragmentTransaction.commitNowAllowingStateLoss();
                } finally {
                    this.mExecutingFinishUpdate = false;
                }
            }
            this.mCurTransaction = null;
        }
    }

    @NonNull
    public abstract Fragment getItem(int i);

    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.viewpager.widget.AbstractC1821a
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.beginTransaction();
        }
        long itemId = getItemId(i);
        Fragment findFragmentByTag = this.mFragmentManager.findFragmentByTag(makeFragmentName(viewGroup.getId(), itemId));
        if (findFragmentByTag != null) {
            this.mCurTransaction.attach(findFragmentByTag);
        } else {
            findFragmentByTag = getItem(i);
            this.mCurTransaction.add(viewGroup.getId(), findFragmentByTag, makeFragmentName(viewGroup.getId(), itemId));
        }
        if (findFragmentByTag != this.mCurrentPrimaryItem) {
            findFragmentByTag.setMenuVisibility(false);
            if (this.mBehavior == 1) {
                this.mCurTransaction.setMaxLifecycle(findFragmentByTag, AbstractC1464h.EnumC1468b.STARTED);
            } else {
                findFragmentByTag.setUserVisibleHint(false);
            }
        }
        return findFragmentByTag;
    }

    @Override // androidx.viewpager.widget.AbstractC1821a
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.AbstractC1821a
    public void restoreState(@Nullable Parcelable parcelable, @Nullable ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.AbstractC1821a
    @Nullable
    public Parcelable saveState() {
        return null;
    }

    @Override // androidx.viewpager.widget.AbstractC1821a
    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.mCurrentPrimaryItem;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.mBehavior == 1) {
                    if (this.mCurTransaction == null) {
                        this.mCurTransaction = this.mFragmentManager.beginTransaction();
                    }
                    this.mCurTransaction.setMaxLifecycle(this.mCurrentPrimaryItem, AbstractC1464h.EnumC1468b.STARTED);
                } else {
                    this.mCurrentPrimaryItem.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.mBehavior == 1) {
                if (this.mCurTransaction == null) {
                    this.mCurTransaction = this.mFragmentManager.beginTransaction();
                }
                this.mCurTransaction.setMaxLifecycle(fragment, AbstractC1464h.EnumC1468b.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = fragment;
        }
    }

    @Override // androidx.viewpager.widget.AbstractC1821a
    public void startUpdate(@NonNull ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
