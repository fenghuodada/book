package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.graphics.drawable.C0166b;
import androidx.appcompat.graphics.drawable.C0172e;
import androidx.appcompat.resources.C0174a;
import androidx.collection.C0474f;
import androidx.collection.C0483j;
import androidx.vectordrawable.graphics.drawable.C1783d;

/* renamed from: androidx.appcompat.graphics.drawable.a */
/* loaded from: classes.dex */
public final class C0159a extends C0172e {

    /* renamed from: p */
    public C0161b f436p;

    /* renamed from: q */
    public AbstractC0165f f437q;

    /* renamed from: r */
    public int f438r;

    /* renamed from: s */
    public int f439s;

    /* renamed from: t */
    public boolean f440t;

    /* renamed from: androidx.appcompat.graphics.drawable.a$a */
    /* loaded from: classes.dex */
    public static class C0160a extends AbstractC0165f {

        /* renamed from: a */
        public final Animatable f441a;

        public C0160a(Animatable animatable) {
            this.f441a = animatable;
        }

        @Override // androidx.appcompat.graphics.drawable.C0159a.AbstractC0165f
        /* renamed from: c */
        public final void mo12916c() {
            this.f441a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.C0159a.AbstractC0165f
        /* renamed from: d */
        public final void mo12915d() {
            this.f441a.stop();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.a$b */
    /* loaded from: classes.dex */
    public static class C0161b extends C0172e.C0173a {

        /* renamed from: I */
        public C0474f<Long> f442I;

        /* renamed from: J */
        public C0483j<Integer> f443J;

        public C0161b(@Nullable C0161b c0161b, @NonNull C0159a c0159a, @Nullable Resources resources) {
            super(c0161b, c0159a, resources);
            C0483j<Integer> c0483j;
            if (c0161b != null) {
                this.f442I = c0161b.f442I;
                c0483j = c0161b.f443J;
            } else {
                this.f442I = new C0474f<>();
                c0483j = new C0483j<>();
            }
            this.f443J = c0483j;
        }

        @Override // androidx.appcompat.graphics.drawable.C0172e.C0173a, androidx.appcompat.graphics.drawable.C0166b.AbstractC0169c
        /* renamed from: e */
        public final void mo12903e() {
            this.f442I = this.f442I.clone();
            this.f443J = this.f443J.clone();
        }

        @Override // androidx.appcompat.graphics.drawable.C0172e.C0173a, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return new C0159a(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.C0172e.C0173a, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable(Resources resources) {
            return new C0159a(this, resources);
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.a$c */
    /* loaded from: classes.dex */
    public static class C0162c extends AbstractC0165f {

        /* renamed from: a */
        public final C1783d f444a;

        public C0162c(C1783d c1783d) {
            this.f444a = c1783d;
        }

        @Override // androidx.appcompat.graphics.drawable.C0159a.AbstractC0165f
        /* renamed from: c */
        public final void mo12916c() {
            this.f444a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.C0159a.AbstractC0165f
        /* renamed from: d */
        public final void mo12915d() {
            this.f444a.stop();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.a$d */
    /* loaded from: classes.dex */
    public static class C0163d extends AbstractC0165f {

        /* renamed from: a */
        public final ObjectAnimator f445a;

        /* renamed from: b */
        public final boolean f446b;

        public C0163d(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            int i;
            int i2;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z) {
                i = numberOfFrames - 1;
            } else {
                i = 0;
            }
            if (z) {
                i2 = 0;
            } else {
                i2 = numberOfFrames - 1;
            }
            C0164e c0164e = new C0164e(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            C0174a.m12901a(ofInt, true);
            ofInt.setDuration(c0164e.f449c);
            ofInt.setInterpolator(c0164e);
            this.f446b = z2;
            this.f445a = ofInt;
        }

        @Override // androidx.appcompat.graphics.drawable.C0159a.AbstractC0165f
        /* renamed from: a */
        public final boolean mo12918a() {
            return this.f446b;
        }

        @Override // androidx.appcompat.graphics.drawable.C0159a.AbstractC0165f
        /* renamed from: b */
        public final void mo12917b() {
            this.f445a.reverse();
        }

        @Override // androidx.appcompat.graphics.drawable.C0159a.AbstractC0165f
        /* renamed from: c */
        public final void mo12916c() {
            this.f445a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.C0159a.AbstractC0165f
        /* renamed from: d */
        public final void mo12915d() {
            this.f445a.cancel();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.a$e */
    /* loaded from: classes.dex */
    public static class C0164e implements TimeInterpolator {

        /* renamed from: a */
        public int[] f447a;

        /* renamed from: b */
        public int f448b;

        /* renamed from: c */
        public int f449c;

        public C0164e(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f448b = numberOfFrames;
            int[] iArr = this.f447a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f447a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f447a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f449c = i;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            int i = (int) ((f * this.f449c) + 0.5f);
            int i2 = this.f448b;
            int[] iArr = this.f447a;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i3];
                if (i < i4) {
                    break;
                }
                i -= i4;
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.f449c : 0.0f);
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.a$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0165f {
        /* renamed from: a */
        public boolean mo12918a() {
            return false;
        }

        /* renamed from: b */
        public void mo12917b() {
        }

        /* renamed from: c */
        public abstract void mo12916c();

        /* renamed from: d */
        public abstract void mo12915d();
    }

    public C0159a() {
        this(null, null);
    }

    public C0159a(@Nullable C0161b c0161b, @Nullable Resources resources) {
        this.f438r = -1;
        this.f439s = -1;
        mo12905e(new C0161b(c0161b, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x026d, code lost:
        r4.onStateChange(r4.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0274, code lost:
        return r4;
     */
    @androidx.annotation.NonNull
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.appcompat.graphics.drawable.C0159a m12919g(@androidx.annotation.NonNull android.content.Context r23, @androidx.annotation.Nullable android.content.res.Resources.Theme r24, @androidx.annotation.NonNull android.content.res.Resources r25, @androidx.annotation.NonNull android.util.AttributeSet r26, @androidx.annotation.NonNull android.content.res.XmlResourceParser r27) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.C0159a.m12919g(android.content.Context, android.content.res.Resources$Theme, android.content.res.Resources, android.util.AttributeSet, android.content.res.XmlResourceParser):androidx.appcompat.graphics.drawable.a");
    }

    @Override // androidx.appcompat.graphics.drawable.C0172e, androidx.appcompat.graphics.drawable.C0166b
    /* renamed from: b */
    public final C0166b.AbstractC0169c mo12906b() {
        return new C0161b(this.f436p, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.C0172e, androidx.appcompat.graphics.drawable.C0166b
    /* renamed from: e */
    public final void mo12905e(@NonNull C0166b.AbstractC0169c abstractC0169c) {
        super.mo12905e(abstractC0169c);
        if (abstractC0169c instanceof C0161b) {
            this.f436p = (C0161b) abstractC0169c;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.C0172e
    /* renamed from: f */
    public final C0172e.C0173a mo12904f() {
        return new C0161b(this.f436p, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.C0166b, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC0165f abstractC0165f = this.f437q;
        if (abstractC0165f != null) {
            abstractC0165f.mo12915d();
            this.f437q = null;
            m12912d(this.f438r);
            this.f438r = -1;
            this.f439s = -1;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.C0172e, androidx.appcompat.graphics.drawable.C0166b, android.graphics.drawable.Drawable
    @NonNull
    public final Drawable mutate() {
        if (!this.f440t) {
            super.mutate();
            this.f436p.mo12903e();
            this.f440t = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0103  */
    @Override // androidx.appcompat.graphics.drawable.C0172e, androidx.appcompat.graphics.drawable.C0166b, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStateChange(@androidx.annotation.NonNull int[] r15) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.C0159a.onStateChange(int[]):boolean");
    }

    @Override // androidx.appcompat.graphics.drawable.C0166b, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        AbstractC0165f abstractC0165f = this.f437q;
        if (abstractC0165f != null && (visible || z2)) {
            if (z) {
                abstractC0165f.mo12916c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
