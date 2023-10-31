package com.facebook.ads.redexgen.p036X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.FC */
/* loaded from: assets/audience_network.dex */
public final class C4807FC extends AbstractC6200bx {
    public static TimeInterpolator A0B;
    public static String[] A0C = {"K3xavpXOVVnTPS8V8FmisIpuez1NdmFn", "QjoCrUVtXYT15qNhmppxWCsnlOvXMRWn", "HVYav4KnfeU3lAWSFDiSVAYelCZD7hW1", "SKhwmHHGUoQzTLK2kw5WKB1efbL3jYLm", "aZpNXGptJoOcjVlsPlgA0RFw1bcc4fI1", "y8DDj9eTKGlZyxtiH83YwnquX80t2qUq", "Eqht3urb", "PkOCx2w9GPXTa0iGANdHxOJetOGxrMw0"};
    public ArrayList<AbstractC41974l> A0A = new ArrayList<>();
    public ArrayList<AbstractC41974l> A07 = new ArrayList<>();
    public ArrayList<C415241> A09 = new ArrayList<>();
    public ArrayList<C415140> A08 = new ArrayList<>();
    public ArrayList<ArrayList<AbstractC41974l>> A01 = new ArrayList<>();
    public ArrayList<ArrayList<C415241>> A05 = new ArrayList<>();
    public ArrayList<ArrayList<C415140>> A03 = new ArrayList<>();
    public ArrayList<AbstractC41974l> A00 = new ArrayList<>();
    public ArrayList<AbstractC41974l> A04 = new ArrayList<>();
    public ArrayList<AbstractC41974l> A06 = new ArrayList<>();
    public ArrayList<AbstractC41974l> A02 = new ArrayList<>();

    private void A01(C415140 c415140) {
        if (c415140.A05 != null) {
            A07(c415140, c415140.A05);
        }
        if (c415140.A04 != null) {
            A07(c415140, c415140.A04);
        }
    }

    private void A03(final AbstractC41974l abstractC41974l) {
        final View view = abstractC41974l.A0H;
        final ViewPropertyAnimator animate = view.animate();
        this.A06.add(abstractC41974l);
        animate.setDuration(A07()).alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3v
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                view.setAlpha(1.0f);
                C4807FC.this.A0P(abstractC41974l);
                C4807FC.this.A06.remove(abstractC41974l);
                C4807FC.this.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }

    private void A04(AbstractC41974l abstractC41974l) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        abstractC41974l.A0H.animate().setInterpolator(A0B);
        A0K(abstractC41974l);
    }

    private final void A05(List<AbstractC41974l> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).A0H.animate().cancel();
        }
    }

    private void A06(List<C415140> list, AbstractC41974l abstractC41974l) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C415140 c415140 = list.get(size);
            if (A07(c415140, abstractC41974l) && c415140.A05 == null && c415140.A04 == null) {
                list.remove(c415140);
            }
        }
    }

    private boolean A07(C415140 c415140, AbstractC41974l abstractC41974l) {
        boolean z = false;
        if (c415140.A04 == abstractC41974l) {
            c415140.A04 = null;
        } else if (c415140.A05 == abstractC41974l) {
            c415140.A05 = null;
            z = true;
        } else {
            return false;
        }
        abstractC41974l.A0H.setAlpha(1.0f);
        abstractC41974l.A0H.setTranslationX(0.0f);
        abstractC41974l.A0H.setTranslationY(0.0f);
        A0Q(abstractC41974l, z);
        return true;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41754P
    public final void A0I() {
        for (int size = this.A09.size() - 1; size >= 0; size--) {
            C415241 c415241 = this.A09.get(size);
            View view = c415241.A04.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A0O(c415241.A04);
            this.A09.remove(size);
        }
        for (int size2 = this.A0A.size() - 1; size2 >= 0; size2--) {
            A0P(this.A0A.get(size2));
            this.A0A.remove(size2);
        }
        for (int size3 = this.A07.size() - 1; size3 >= 0; size3--) {
            AbstractC41974l abstractC41974l = this.A07.get(size3);
            abstractC41974l.A0H.setAlpha(1.0f);
            A0N(abstractC41974l);
            this.A07.remove(size3);
        }
        for (int size4 = this.A08.size() - 1; size4 >= 0; size4--) {
            A01(this.A08.get(size4));
        }
        this.A08.clear();
        if (!A0L()) {
            return;
        }
        int listCount = this.A05.size();
        for (int i = listCount - 1; i >= 0; i--) {
            ArrayList<C415241> arrayList = this.A05.get(i);
            int listCount2 = arrayList.size();
            for (int i2 = listCount2 - 1; i2 >= 0; i2--) {
                C415241 moveInfo = arrayList.get(i2);
                View view2 = moveInfo.A04.A0H;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                A0O(moveInfo.A04);
                arrayList.remove(i2);
                if (arrayList.isEmpty()) {
                    this.A05.remove(arrayList);
                }
            }
        }
        for (int size5 = this.A01.size() - 1; size5 >= 0; size5--) {
            ArrayList<AbstractC41974l> arrayList2 = this.A01.get(size5);
            int i3 = arrayList2.size();
            for (int i4 = i3 - 1; i4 >= 0; i4--) {
                AbstractC41974l item = arrayList2.get(i4);
                item.A0H.setAlpha(1.0f);
                A0N(item);
                arrayList2.remove(i4);
                if (arrayList2.isEmpty()) {
                    this.A01.remove(arrayList2);
                }
            }
        }
        for (int size6 = this.A03.size() - 1; size6 >= 0; size6--) {
            ArrayList<C415140> arrayList3 = this.A03.get(size6);
            int j = arrayList3.size();
            for (int i5 = j - 1; i5 >= 0; i5--) {
                A01(arrayList3.get(i5));
                if (arrayList3.isEmpty()) {
                    this.A03.remove(arrayList3);
                }
            }
        }
        A05(this.A06);
        A05(this.A04);
        A05(this.A00);
        A05(this.A02);
        A0A();
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x0033 */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC41754P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0J() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C4807FC.A0J():void");
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41754P
    public final void A0K(AbstractC41974l abstractC41974l) {
        View view = abstractC41974l.A0H;
        view.animate().cancel();
        for (int size = this.A09.size() - 1; size >= 0; size--) {
            C415241 moveInfo = this.A09.get(size);
            if (moveInfo.A04 == abstractC41974l) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                A0O(abstractC41974l);
                this.A09.remove(size);
            }
        }
        A06(this.A08, abstractC41974l);
        if (this.A0A.remove(abstractC41974l)) {
            view.setAlpha(1.0f);
            A0P(abstractC41974l);
        }
        if (this.A07.remove(abstractC41974l)) {
            view.setAlpha(1.0f);
            A0N(abstractC41974l);
        }
        for (int size2 = this.A03.size() - 1; size2 >= 0; size2--) {
            ArrayList<C415140> arrayList = this.A03.get(size2);
            A06(arrayList, abstractC41974l);
            if (arrayList.isEmpty()) {
                this.A03.remove(size2);
            }
        }
        for (int size3 = this.A05.size() - 1; size3 >= 0; size3--) {
            ArrayList<C415241> arrayList2 = this.A05.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).A04 == abstractC41974l) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    String[] strArr = A0C;
                    String str = strArr[4];
                    String str2 = strArr[3];
                    int charAt = str.charAt(9);
                    int j = str2.charAt(9);
                    if (charAt != j) {
                        throw new RuntimeException();
                    }
                    A0C[1] = "ZnQkkSK02m4qlFQsfXGc8k1uWyp7aRL1";
                    A0O(abstractC41974l);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.A05.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        int size5 = this.A01.size();
        if (A0C[0].charAt(3) == 'S') {
            throw new RuntimeException();
        }
        A0C[7] = "NHib0yCpDtVNZGbvtAXjIsv6RzrfBwwf";
        for (int i = size5 - 1; i >= 0; i--) {
            ArrayList<AbstractC41974l> arrayList3 = this.A01.get(i);
            if (arrayList3.remove(abstractC41974l)) {
                view.setAlpha(1.0f);
                A0N(abstractC41974l);
                if (arrayList3.isEmpty()) {
                    this.A01.remove(i);
                }
            }
        }
        this.A06.remove(abstractC41974l);
        this.A00.remove(abstractC41974l);
        this.A02.remove(abstractC41974l);
        this.A04.remove(abstractC41974l);
        A0V();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
        if (r4.A02.isEmpty() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
        if (r4.A05.isEmpty() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
        if (r4.A01.isEmpty() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
        r3 = r4.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
        if (com.facebook.ads.redexgen.p036X.C4807FC.A0C[7].charAt(30) == 'w') goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a1, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ab, code lost:
        com.facebook.ads.redexgen.p036X.C4807FC.A0C[7] = "80rjjAfjuSoUPBYOWBOUrC4mhnJBtDwK";
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
        if (r3.isEmpty() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
        return false;
     */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC41754P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0L() {
        /*
            r4 = this;
            java.util.ArrayList<com.facebook.ads.redexgen.X.4l> r0 = r4.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.40> r0 = r4.A08
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.41> r0 = r4.A09
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.4l> r0 = r4.A0A
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.4l> r0 = r4.A04
            boolean r3 = r0.isEmpty()
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C4807FC.A0C
            r0 = 2
            r1 = r2[r0]
            r0 = 5
            r2 = r2[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto La5
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C4807FC.A0C
            java.lang.String r1 = "HATKbuX1ioRbKjbJza4uRkbMkwnilInw"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "55W5G9gSwoJRpeM2nuMk9rdzPBhIsXI5"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.4l> r0 = r4.A06
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.4l> r0 = r4.A00
            boolean r3 = r0.isEmpty()
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C4807FC.A0C
            r0 = 2
            r1 = r2[r0]
            r0 = 5
            r2 = r2[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto La2
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C4807FC.A0C
            java.lang.String r1 = "PBqWGImhwZdo7IXQpaNFK9QlBHxMp4wk"
            r0 = 7
            r2[r0] = r1
            if (r3 == 0) goto Lb8
        L73:
            java.util.ArrayList<com.facebook.ads.redexgen.X.4l> r0 = r4.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.X.41>> r0 = r4.A05
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.X.4l>> r0 = r4.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.X.40>> r3 = r4.A03
            java.lang.String[] r1 = com.facebook.ads.redexgen.p036X.C4807FC.A0C
            r0 = 7
            r1 = r1[r0]
            r0 = 30
            char r1 = r1.charAt(r0)
            r0 = 119(0x77, float:1.67E-43)
            if (r1 == r0) goto Lab
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        La2:
            if (r3 == 0) goto Lb8
            goto L73
        La5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        Lab:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C4807FC.A0C
            java.lang.String r1 = "80rjjAfjuSoUPBYOWBOUrC4mhnJBtDwK"
            r0 = 7
            r2[r0] = r1
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Lba
        Lb8:
            r0 = 1
        Lb9:
            return r0
        Lba:
            r0 = 0
            goto Lb9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C4807FC.A0L():boolean");
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41754P
    public final boolean A0M(@NonNull AbstractC41974l abstractC41974l, @NonNull List<Object> list) {
        return !list.isEmpty() || super.A0M(abstractC41974l, list);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6200bx
    public final boolean A0R(AbstractC41974l abstractC41974l) {
        A04(abstractC41974l);
        abstractC41974l.A0H.setAlpha(0.0f);
        this.A07.add(abstractC41974l);
        return true;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6200bx
    public final boolean A0S(AbstractC41974l abstractC41974l) {
        A04(abstractC41974l);
        this.A0A.add(abstractC41974l);
        return true;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6200bx
    public final boolean A0T(AbstractC41974l abstractC41974l, int i, int i2, int i3, int i4) {
        View view = abstractC41974l.A0H;
        int deltaY = i + ((int) abstractC41974l.A0H.getTranslationX());
        int fromX = (int) abstractC41974l.A0H.getTranslationY();
        int i5 = i2 + fromX;
        A04(abstractC41974l);
        int fromY = i3 - deltaY;
        int i6 = i4 - i5;
        if (fromY == 0 && i6 == 0) {
            A0O(abstractC41974l);
            return false;
        }
        if (fromY != 0) {
            int deltaX = -fromY;
            view.setTranslationX(deltaX);
        }
        if (i6 != 0) {
            int deltaX2 = -i6;
            view.setTranslationY(deltaX2);
        }
        this.A09.add(new C415241(abstractC41974l, deltaY, i5, i3, i4));
        return true;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6200bx
    public final boolean A0U(AbstractC41974l abstractC41974l, AbstractC41974l abstractC41974l2, int deltaX, int deltaY, int i, int i2) {
        if (abstractC41974l == abstractC41974l2) {
            return A0T(abstractC41974l, deltaX, deltaY, i, i2);
        }
        float translationX = abstractC41974l.A0H.getTranslationX();
        float translationY = abstractC41974l.A0H.getTranslationY();
        float alpha = abstractC41974l.A0H.getAlpha();
        A04(abstractC41974l);
        int i3 = (int) ((i - deltaX) - translationX);
        int i4 = (int) ((i2 - deltaY) - translationY);
        abstractC41974l.A0H.setTranslationX(translationX);
        abstractC41974l.A0H.setTranslationY(translationY);
        abstractC41974l.A0H.setAlpha(alpha);
        if (abstractC41974l2 != null) {
            A04(abstractC41974l2);
            abstractC41974l2.A0H.setTranslationX(-i3);
            abstractC41974l2.A0H.setTranslationY(-i4);
            abstractC41974l2.A0H.setAlpha(0.0f);
        }
        this.A08.add(new C415140(abstractC41974l, abstractC41974l2, deltaX, deltaY, i, i2));
        return true;
    }

    public final void A0V() {
        if (!A0L()) {
            A0A();
        }
    }

    public final void A0W(final C415140 c415140) {
        final View view;
        AbstractC41974l abstractC41974l = c415140.A05;
        if (abstractC41974l == null) {
            view = null;
        } else {
            view = abstractC41974l.A0H;
        }
        AbstractC41974l abstractC41974l2 = c415140.A04;
        final View view2 = abstractC41974l2 != null ? abstractC41974l2.A0H : null;
        if (view != null) {
            final ViewPropertyAnimator duration = view.animate().setDuration(A05());
            this.A02.add(c415140.A05);
            duration.translationX(c415140.A02 - c415140.A00);
            duration.translationY(c415140.A03 - c415140.A01);
            ViewPropertyAnimator oldViewAnim = duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3y
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    duration.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    C4807FC.this.A0Q(c415140.A05, true);
                    C4807FC.this.A02.remove(c415140.A05);
                    C4807FC.this.A0V();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            });
            oldViewAnim.start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator animate = view2.animate();
            this.A02.add(c415140.A04);
            ViewPropertyAnimator newViewAnimation = animate.translationX(0.0f);
            newViewAnimation.translationY(0.0f).setDuration(A05()).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3z
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    animate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    C4807FC.this.A0Q(c415140.A04, false);
                    C4807FC.this.A02.remove(c415140.A04);
                    C4807FC.this.A0V();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            }).start();
        }
    }

    public final void A0X(final AbstractC41974l abstractC41974l) {
        final View view = abstractC41974l.A0H;
        final ViewPropertyAnimator animate = view.animate();
        this.A00.add(abstractC41974l);
        animate.alpha(1.0f).setDuration(A04()).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3w
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                C4807FC.this.A0N(abstractC41974l);
                C4807FC.this.A00.remove(abstractC41974l);
                C4807FC.this.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }

    public final void A0Y(final AbstractC41974l abstractC41974l, int i, int i2, int i3, int deltaX) {
        final View view = abstractC41974l.A0H;
        final int i4 = i3 - i;
        final int deltaX2 = deltaX - i2;
        if (i4 != 0) {
            view.animate().translationX(0.0f);
        }
        if (deltaX2 != 0) {
            view.animate().translationY(0.0f);
        }
        final ViewPropertyAnimator animate = view.animate();
        this.A04.add(abstractC41974l);
        ViewPropertyAnimator animation = animate.setDuration(A06());
        animation.setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3x
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                if (i4 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (deltaX2 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                C4807FC.this.A0O(abstractC41974l);
                C4807FC.this.A04.remove(abstractC41974l);
                C4807FC.this.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }
}
