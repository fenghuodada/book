package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.collection.C0470b;
import androidx.core.graphics.drawable.C0700a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.vectordrawable.graphics.drawable.d */
/* loaded from: classes.dex */
public final class C1783d extends AbstractC1791h implements Animatable {

    /* renamed from: g */
    public static final /* synthetic */ int f4304g = 0;

    /* renamed from: b */
    public final C1785b f4305b;

    /* renamed from: c */
    public final Context f4306c;

    /* renamed from: d */
    public C1787e f4307d;

    /* renamed from: e */
    public ArrayList<AbstractC1782c> f4308e;

    /* renamed from: f */
    public final C1784a f4309f;

    /* renamed from: androidx.vectordrawable.graphics.drawable.d$a */
    /* loaded from: classes.dex */
    public class C1784a implements Drawable.Callback {
        public C1784a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            C1783d.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C1783d.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C1783d.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.d$b */
    /* loaded from: classes.dex */
    public static class C1785b extends Drawable.ConstantState {

        /* renamed from: a */
        public C1792i f4311a;

        /* renamed from: b */
        public AnimatorSet f4312b;

        /* renamed from: c */
        public ArrayList<Animator> f4313c;

        /* renamed from: d */
        public C0470b<Animator, String> f4314d;

        public C1785b(C1784a c1784a) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    @RequiresApi(24)
    /* renamed from: androidx.vectordrawable.graphics.drawable.d$c */
    /* loaded from: classes.dex */
    public static class C1786c extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f4315a;

        public C1786c(Drawable.ConstantState constantState) {
            this.f4315a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f4315a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f4315a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            C1783d c1783d = new C1783d();
            Drawable newDrawable = this.f4315a.newDrawable();
            c1783d.f4319a = newDrawable;
            newDrawable.setCallback(c1783d.f4309f);
            return c1783d;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            C1783d c1783d = new C1783d();
            Drawable newDrawable = this.f4315a.newDrawable(resources);
            c1783d.f4319a = newDrawable;
            newDrawable.setCallback(c1783d.f4309f);
            return c1783d;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1783d c1783d = new C1783d();
            Drawable newDrawable = this.f4315a.newDrawable(resources, theme);
            c1783d.f4319a = newDrawable;
            newDrawable.setCallback(c1783d.f4309f);
            return c1783d;
        }
    }

    public C1783d() {
        this(null);
    }

    public C1783d(@Nullable Context context) {
        this.f4307d = null;
        this.f4308e = null;
        C1784a c1784a = new C1784a();
        this.f4309f = c1784a;
        this.f4306c = context;
        this.f4305b = new C1785b(c1784a);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1791h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            C0700a.C0702b.m11931a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            return C0700a.C0702b.m11930b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C1785b c1785b = this.f4305b;
        c1785b.f4311a.draw(canvas);
        if (c1785b.f4312b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            return C0700a.C0701a.m11936a(drawable);
        }
        return this.f4305b.f4311a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f4305b.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            return C0700a.C0702b.m11929c(drawable);
        }
        return this.f4305b.f4311a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f4319a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C1786c(this.f4319a.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f4319a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f4305b.f4311a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f4319a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f4305b.f4311a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f4319a;
        return drawable != null ? drawable.getOpacity() : this.f4305b.f4311a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x017c, code lost:
        if (r8.f4312b != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017e, code lost:
        r8.f4312b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0185, code lost:
        r8.f4312b.playTogether(r8.f4313c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x018c, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.C1783d.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            return C0700a.C0701a.m11933d(drawable);
        }
        return this.f4305b.f4311a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f4319a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f4305b.f4312b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f4319a;
        return drawable != null ? drawable.isStateful() : this.f4305b.f4311a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f4305b.f4311a.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1791h, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f4319a;
        return drawable != null ? drawable.setLevel(i) : this.f4305b.f4311a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4319a;
        return drawable != null ? drawable.setState(iArr) : this.f4305b.f4311a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f4305b.f4311a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            C0700a.C0701a.m11932e(drawable, z);
        } else {
            this.f4305b.f4311a.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4305b.f4311a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            C0700a.m11939a(drawable, i);
        } else {
            this.f4305b.f4311a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            C0700a.m11938b(drawable, colorStateList);
        } else {
            this.f4305b.f4311a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            C0700a.m11937c(drawable, mode);
        } else {
            this.f4305b.f4311a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f4305b.f4311a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C1785b c1785b = this.f4305b;
        if (c1785b.f4312b.isStarted()) {
            return;
        }
        c1785b.f4312b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f4319a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f4305b.f4312b.end();
        }
    }
}
