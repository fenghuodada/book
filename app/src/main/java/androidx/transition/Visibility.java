package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.transition.Transition;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class Visibility extends Transition {

    /* renamed from: y */
    public static final String[] f4207y = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: x */
    public int f4208x = 3;

    @SuppressLint({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface Mode {
    }

    /* renamed from: androidx.transition.Visibility$a */
    /* loaded from: classes.dex */
    public static class C1724a extends AnimatorListenerAdapter implements Transition.InterfaceC1723d {

        /* renamed from: a */
        public final View f4209a;

        /* renamed from: b */
        public final int f4210b;

        /* renamed from: c */
        public final ViewGroup f4211c;

        /* renamed from: e */
        public boolean f4213e;

        /* renamed from: f */
        public boolean f4214f = false;

        /* renamed from: d */
        public final boolean f4212d = true;

        public C1724a(View view, int i) {
            this.f4209a = view;
            this.f4210b = i;
            this.f4211c = (ViewGroup) view.getParent();
            m9996f(true);
        }

        @Override // androidx.transition.Transition.InterfaceC1723d
        /* renamed from: a */
        public final void mo9987a() {
            m9996f(false);
        }

        @Override // androidx.transition.Transition.InterfaceC1723d
        /* renamed from: b */
        public final void mo9986b() {
        }

        @Override // androidx.transition.Transition.InterfaceC1723d
        /* renamed from: c */
        public final void mo9962c(@NonNull Transition transition) {
            if (!this.f4214f) {
                C1770s.f4286a.mo9989a(this.f4210b, this.f4209a);
                ViewGroup viewGroup = this.f4211c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m9996f(false);
            transition.mo9966w(this);
        }

        @Override // androidx.transition.Transition.InterfaceC1723d
        /* renamed from: d */
        public final void mo9961d() {
        }

        @Override // androidx.transition.Transition.InterfaceC1723d
        /* renamed from: e */
        public final void mo9985e() {
            m9996f(true);
        }

        /* renamed from: f */
        public final void m9996f(boolean z) {
            ViewGroup viewGroup;
            if (!this.f4212d || this.f4213e == z || (viewGroup = this.f4211c) == null) {
                return;
            }
            this.f4213e = z;
            C1769r.m9957a(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f4214f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f4214f) {
                C1770s.f4286a.mo9989a(this.f4210b, this.f4209a);
                ViewGroup viewGroup = this.f4211c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m9996f(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            if (!this.f4214f) {
                C1770s.f4286a.mo9989a(this.f4210b, this.f4209a);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            if (!this.f4214f) {
                C1770s.f4286a.mo9989a(0, this.f4209a);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: androidx.transition.Visibility$b */
    /* loaded from: classes.dex */
    public static class C1725b {

        /* renamed from: a */
        public boolean f4215a;

        /* renamed from: b */
        public boolean f4216b;

        /* renamed from: c */
        public int f4217c;

        /* renamed from: d */
        public int f4218d;

        /* renamed from: e */
        public ViewGroup f4219e;

        /* renamed from: f */
        public ViewGroup f4220f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
        if (r9 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
        if (r0.f4219e == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
        if (r0.f4217c == 0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.transition.Visibility.C1725b m9998J(androidx.transition.C1766o r8, androidx.transition.C1766o r9) {
        /*
            androidx.transition.Visibility$b r0 = new androidx.transition.Visibility$b
            r0.<init>()
            r1 = 0
            r0.f4215a = r1
            r0.f4216b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f4278a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f4217c = r7
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f4219e = r6
            goto L33
        L2f:
            r0.f4217c = r4
            r0.f4219e = r3
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f4278a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r3 = r6.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f4218d = r3
            java.lang.Object r2 = r6.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f4220f = r2
            goto L56
        L52:
            r0.f4218d = r4
            r0.f4220f = r3
        L56:
            r2 = 1
            if (r8 == 0) goto L7a
            if (r9 == 0) goto L7a
            int r8 = r0.f4217c
            int r9 = r0.f4218d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f4219e
            android.view.ViewGroup r4 = r0.f4220f
            if (r3 != r4) goto L68
            return r0
        L68:
            if (r8 == r9) goto L70
            if (r8 != 0) goto L6d
            goto L89
        L6d:
            if (r9 != 0) goto L8d
            goto L80
        L70:
            android.view.ViewGroup r8 = r0.f4220f
            if (r8 != 0) goto L75
            goto L89
        L75:
            android.view.ViewGroup r8 = r0.f4219e
            if (r8 != 0) goto L8d
            goto L80
        L7a:
            if (r8 != 0) goto L83
            int r8 = r0.f4218d
            if (r8 != 0) goto L83
        L80:
            r0.f4216b = r2
            goto L8b
        L83:
            if (r9 != 0) goto L8d
            int r8 = r0.f4217c
            if (r8 != 0) goto L8d
        L89:
            r0.f4216b = r1
        L8b:
            r0.f4215a = r2
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.m9998J(androidx.transition.o, androidx.transition.o):androidx.transition.Visibility$b");
    }

    /* renamed from: I */
    public final void m9999I(C1766o c1766o) {
        View view = c1766o.f4279b;
        int visibility = view.getVisibility();
        HashMap hashMap = c1766o.f4278a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    @Override // androidx.transition.Transition
    /* renamed from: d */
    public final void mo9972d(@NonNull C1766o c1766o) {
        m9999I(c1766o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (m9998J(m10004o(r3, false), m10002r(r3, false)).f4215a != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01eb  */
    @Override // androidx.transition.Transition
    @androidx.annotation.Nullable
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator mo9994l(@androidx.annotation.NonNull android.view.ViewGroup r22, @androidx.annotation.Nullable androidx.transition.C1766o r23, @androidx.annotation.Nullable androidx.transition.C1766o r24) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.mo9994l(android.view.ViewGroup, androidx.transition.o, androidx.transition.o):android.animation.Animator");
    }

    @Override // androidx.transition.Transition
    @Nullable
    /* renamed from: q */
    public final String[] mo9993q() {
        return f4207y;
    }

    @Override // androidx.transition.Transition
    /* renamed from: s */
    public final boolean mo9997s(C1766o c1766o, C1766o c1766o2) {
        if (c1766o == null && c1766o2 == null) {
            return false;
        }
        if (c1766o == null || c1766o2 == null || c1766o2.f4278a.containsKey("android:visibility:visibility") == c1766o.f4278a.containsKey("android:visibility:visibility")) {
            C1725b m9998J = m9998J(c1766o, c1766o2);
            if (m9998J.f4215a) {
                return m9998J.f4217c == 0 || m9998J.f4218d == 0;
            }
            return false;
        }
        return false;
    }
}
