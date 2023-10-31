package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.graphics.drawable.C0171d;
import androidx.core.util.C0804h;
import androidx.interpolator.view.animation.C1436a;
import com.ambrose.overwall.R;
import com.google.android.material.animation.C7556a;
import com.google.android.material.animation.C7557b;
import com.google.android.material.animation.C7561f;
import com.google.android.material.animation.C7562g;
import com.google.android.material.animation.C7563h;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.C7749h;
import com.google.android.material.motion.C7769a;
import com.google.android.material.shadow.InterfaceC7789b;
import com.google.android.material.shape.C7801j;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.material.floatingactionbutton.d */
/* loaded from: classes3.dex */
public class C7726d {
    @Nullable

    /* renamed from: a */
    public C7801j f14965a;

    /* renamed from: b */
    public boolean f14966b;

    /* renamed from: d */
    public float f14968d;

    /* renamed from: e */
    public float f14969e;

    /* renamed from: f */
    public float f14970f;
    @Nullable

    /* renamed from: g */
    public Animator f14971g;
    @Nullable

    /* renamed from: h */
    public C7563h f14972h;
    @Nullable

    /* renamed from: i */
    public C7563h f14973i;

    /* renamed from: j */
    public float f14974j;

    /* renamed from: l */
    public int f14976l;

    /* renamed from: n */
    public ArrayList<Animator.AnimatorListener> f14978n;

    /* renamed from: o */
    public ArrayList<Animator.AnimatorListener> f14979o;

    /* renamed from: p */
    public ArrayList<InterfaceC7732f> f14980p;

    /* renamed from: q */
    public final FloatingActionButton f14981q;

    /* renamed from: r */
    public final InterfaceC7789b f14982r;
    @Nullable

    /* renamed from: w */
    public ViewTreeObserver$OnPreDrawListenerC7737f f14987w;

    /* renamed from: x */
    public static final C1436a f14962x = C7556a.f14284c;

    /* renamed from: y */
    public static final int f14963y = R.attr.motionDurationLong2;

    /* renamed from: z */
    public static final int f14964z = R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: A */
    public static final int f14954A = R.attr.motionDurationMedium1;

    /* renamed from: B */
    public static final int f14955B = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* renamed from: C */
    public static final int[] f14956C = {16842919, 16842910};

    /* renamed from: D */
    public static final int[] f14957D = {16843623, 16842908, 16842910};

    /* renamed from: E */
    public static final int[] f14958E = {16842908, 16842910};

    /* renamed from: F */
    public static final int[] f14959F = {16843623, 16842910};

    /* renamed from: G */
    public static final int[] f14960G = {16842910};

    /* renamed from: H */
    public static final int[] f14961H = new int[0];

    /* renamed from: c */
    public boolean f14967c = true;

    /* renamed from: k */
    public float f14975k = 1.0f;

    /* renamed from: m */
    public int f14977m = 0;

    /* renamed from: s */
    public final Rect f14983s = new Rect();

    /* renamed from: t */
    public final RectF f14984t = new RectF();

    /* renamed from: u */
    public final RectF f14985u = new RectF();

    /* renamed from: v */
    public final Matrix f14986v = new Matrix();

    /* renamed from: com.google.android.material.floatingactionbutton.d$a */
    /* loaded from: classes3.dex */
    public class C7727a extends C7562g {
        public C7727a() {
        }

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
            C7726d.this.f14975k = f;
            float[] fArr = this.f14291a;
            matrix.getValues(fArr);
            float[] fArr2 = this.f14292b;
            matrix2.getValues(fArr2);
            for (int i = 0; i < 9; i++) {
                float f2 = fArr2[i];
                float f3 = fArr[i];
                fArr2[i] = C0171d.m12907a(f2, f3, f, f3);
            }
            Matrix matrix3 = this.f14293c;
            matrix3.setValues(fArr2);
            return matrix3;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$b */
    /* loaded from: classes3.dex */
    public class C7728b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ float f14989a;

        /* renamed from: b */
        public final /* synthetic */ float f14990b;

        /* renamed from: c */
        public final /* synthetic */ float f14991c;

        /* renamed from: d */
        public final /* synthetic */ float f14992d;

        /* renamed from: e */
        public final /* synthetic */ float f14993e;

        /* renamed from: f */
        public final /* synthetic */ float f14994f;

        /* renamed from: g */
        public final /* synthetic */ float f14995g;

        /* renamed from: h */
        public final /* synthetic */ Matrix f14996h;

        public C7728b(float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
            this.f14989a = f;
            this.f14990b = f2;
            this.f14991c = f3;
            this.f14992d = f4;
            this.f14993e = f5;
            this.f14994f = f6;
            this.f14995g = f7;
            this.f14996h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C7726d c7726d = C7726d.this;
            c7726d.f14981q.setAlpha(C7556a.m4809a(this.f14989a, this.f14990b, 0.0f, 0.2f, floatValue));
            FloatingActionButton floatingActionButton = c7726d.f14981q;
            float f = this.f14992d;
            float f2 = this.f14991c;
            floatingActionButton.setScaleX(((f - f2) * floatValue) + f2);
            FloatingActionButton floatingActionButton2 = c7726d.f14981q;
            float f3 = this.f14993e;
            floatingActionButton2.setScaleY(((f - f3) * floatValue) + f3);
            float f4 = this.f14995g;
            float f5 = this.f14994f;
            c7726d.f14975k = C0171d.m12907a(f4, f5, floatValue, f5);
            float m12907a = C0171d.m12907a(f4, f5, floatValue, f5);
            Matrix matrix = this.f14996h;
            c7726d.m4552a(m12907a, matrix);
            c7726d.f14981q.setImageMatrix(matrix);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$c */
    /* loaded from: classes3.dex */
    public class C7729c extends AbstractC7735i {
        public C7729c(C7738g c7738g) {
            super(c7738g);
        }

        @Override // com.google.android.material.floatingactionbutton.C7726d.AbstractC7735i
        /* renamed from: a */
        public final float mo4544a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d */
    /* loaded from: classes3.dex */
    public class C7730d extends AbstractC7735i {

        /* renamed from: c */
        public final /* synthetic */ C7726d f14998c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7730d(C7738g c7738g) {
            super(c7738g);
            this.f14998c = c7738g;
        }

        @Override // com.google.android.material.floatingactionbutton.C7726d.AbstractC7735i
        /* renamed from: a */
        public final float mo4544a() {
            C7726d c7726d = this.f14998c;
            return c7726d.f14968d + c7726d.f14969e;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$e */
    /* loaded from: classes3.dex */
    public class C7731e extends AbstractC7735i {

        /* renamed from: c */
        public final /* synthetic */ C7726d f14999c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7731e(C7738g c7738g) {
            super(c7738g);
            this.f14999c = c7738g;
        }

        @Override // com.google.android.material.floatingactionbutton.C7726d.AbstractC7735i
        /* renamed from: a */
        public final float mo4544a() {
            C7726d c7726d = this.f14999c;
            return c7726d.f14968d + c7726d.f14970f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$f */
    /* loaded from: classes3.dex */
    public interface InterfaceC7732f {
        /* renamed from: a */
        void mo4546a();

        /* renamed from: b */
        void mo4545b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$g */
    /* loaded from: classes3.dex */
    public interface InterfaceC7733g {
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$h */
    /* loaded from: classes3.dex */
    public class C7734h extends AbstractC7735i {

        /* renamed from: c */
        public final /* synthetic */ C7726d f15000c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7734h(C7738g c7738g) {
            super(c7738g);
            this.f15000c = c7738g;
        }

        @Override // com.google.android.material.floatingactionbutton.C7726d.AbstractC7735i
        /* renamed from: a */
        public final float mo4544a() {
            return this.f15000c.f14968d;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$i */
    /* loaded from: classes3.dex */
    public abstract class AbstractC7735i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public boolean f15001a;

        /* renamed from: b */
        public final /* synthetic */ C7726d f15002b;

        public AbstractC7735i(C7738g c7738g) {
            this.f15002b = c7738g;
        }

        /* renamed from: a */
        public abstract float mo4544a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f15002b.getClass();
            this.f15001a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            boolean z = this.f15001a;
            C7726d c7726d = this.f15002b;
            if (!z) {
                c7726d.getClass();
                mo4544a();
                this.f15001a = true;
            }
            valueAnimator.getAnimatedFraction();
            c7726d.getClass();
        }
    }

    public C7726d(FloatingActionButton floatingActionButton, FloatingActionButton.C7721b c7721b) {
        this.f14981q = floatingActionButton;
        this.f14982r = c7721b;
        C7749h c7749h = new C7749h();
        C7738g c7738g = (C7738g) this;
        c7749h.m4514a(f14956C, m4549d(new C7731e(c7738g)));
        c7749h.m4514a(f14957D, m4549d(new C7730d(c7738g)));
        c7749h.m4514a(f14958E, m4549d(new C7730d(c7738g)));
        c7749h.m4514a(f14959F, m4549d(new C7730d(c7738g)));
        c7749h.m4514a(f14960G, m4549d(new C7734h(c7738g)));
        c7749h.m4514a(f14961H, m4549d(new C7729c(c7738g)));
        this.f14974j = floatingActionButton.getRotation();
    }

    @NonNull
    /* renamed from: d */
    public static ValueAnimator m4549d(@NonNull AbstractC7735i abstractC7735i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f14962x);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(abstractC7735i);
        valueAnimator.addUpdateListener(abstractC7735i);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* renamed from: a */
    public final void m4552a(float f, @NonNull Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f14981q.getDrawable();
        if (drawable == null || this.f14976l == 0) {
            return;
        }
        RectF rectF = this.f14984t;
        RectF rectF2 = this.f14985u;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i = this.f14976l;
        rectF2.set(0.0f, 0.0f, i, i);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i2 = this.f14976l;
        matrix.postScale(f, f, i2 / 2.0f, i2 / 2.0f);
    }

    @NonNull
    /* renamed from: b */
    public final AnimatorSet m4551b(@NonNull C7563h c7563h, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f};
        FloatingActionButton floatingActionButton = this.f14981q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, property, fArr);
        c7563h.m4805c("opacity").m4804a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, View.SCALE_X, f2);
        c7563h.m4805c("scale").m4804a(ofFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            ofFloat2.setEvaluator(new C7736e());
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, View.SCALE_Y, f2);
        c7563h.m4805c("scale").m4804a(ofFloat3);
        if (i == 26) {
            ofFloat3.setEvaluator(new C7736e());
        }
        arrayList.add(ofFloat3);
        Matrix matrix = this.f14986v;
        m4552a(f3, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new C7561f(), new C7727a(), new Matrix(matrix));
        c7563h.m4805c("iconScale").m4804a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C7557b.m4808a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: c */
    public final AnimatorSet m4550c(float f, float f2, float f3, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f14981q;
        ofFloat.addUpdateListener(new C7728b(floatingActionButton.getAlpha(), f, floatingActionButton.getScaleX(), f2, floatingActionButton.getScaleY(), this.f14975k, f3, new Matrix(this.f14986v)));
        arrayList.add(ofFloat);
        C7557b.m4808a(animatorSet, arrayList);
        animatorSet.setDuration(C7769a.m4500c(floatingActionButton.getContext(), i, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(C7769a.m4499d(floatingActionButton.getContext(), i2, C7556a.f14283b));
        return animatorSet;
    }

    /* renamed from: e */
    public float mo4543e() {
        throw null;
    }

    /* renamed from: f */
    public void mo4542f(@NonNull Rect rect) {
        int sizeDimension = this.f14966b ? (0 - this.f14981q.getSizeDimension()) / 2 : 0;
        float mo4543e = this.f14967c ? mo4543e() + this.f14970f : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil(mo4543e));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(mo4543e * 1.5f));
        rect.set(max, max2, max, max2);
    }

    /* renamed from: g */
    public void mo4541g() {
        throw null;
    }

    /* renamed from: h */
    public void mo4540h() {
        throw null;
    }

    /* renamed from: i */
    public void mo4539i(int[] iArr) {
        throw null;
    }

    /* renamed from: j */
    public void mo4538j(float f, float f2, float f3) {
        throw null;
    }

    /* renamed from: k */
    public final void m4548k() {
        ArrayList<InterfaceC7732f> arrayList = this.f14980p;
        if (arrayList != null) {
            Iterator<InterfaceC7732f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo4546a();
            }
        }
    }

    /* renamed from: l */
    public void mo4537l() {
        throw null;
    }

    /* renamed from: m */
    public void mo4536m() {
        throw null;
    }

    /* renamed from: n */
    public final void m4547n() {
        mo4542f(this.f14983s);
        C0804h.m11791c(null, "Didn't initialize content background");
        throw null;
    }
}
