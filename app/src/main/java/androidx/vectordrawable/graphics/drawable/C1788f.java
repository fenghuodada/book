package androidx.vectordrawable.graphics.drawable;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.C0687i;
import androidx.core.graphics.C0694d;
import androidx.core.provider.C0758e;
import java.util.ArrayList;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.vectordrawable.graphics.drawable.f */
/* loaded from: classes.dex */
public final class C1788f {

    /* renamed from: androidx.vectordrawable.graphics.drawable.f$a */
    /* loaded from: classes.dex */
    public static class C1789a implements TypeEvaluator<C0694d.C0695a[]> {

        /* renamed from: a */
        public C0694d.C0695a[] f4317a;

        @Override // android.animation.TypeEvaluator
        public final C0694d.C0695a[] evaluate(float f, C0694d.C0695a[] c0695aArr, C0694d.C0695a[] c0695aArr2) {
            C0694d.C0695a[] c0695aArr3 = c0695aArr;
            C0694d.C0695a[] c0695aArr4 = c0695aArr2;
            if (C0694d.m11963a(c0695aArr3, c0695aArr4)) {
                if (!C0694d.m11963a(this.f4317a, c0695aArr3)) {
                    this.f4317a = C0694d.m11959e(c0695aArr3);
                }
                for (int i = 0; i < c0695aArr3.length; i++) {
                    C0694d.C0695a c0695a = this.f4317a[i];
                    C0694d.C0695a c0695a2 = c0695aArr3[i];
                    C0694d.C0695a c0695a3 = c0695aArr4[i];
                    c0695a.getClass();
                    c0695a.f2389a = c0695a2.f2389a;
                    int i2 = 0;
                    while (true) {
                        float[] fArr = c0695a2.f2390b;
                        if (i2 < fArr.length) {
                            c0695a.f2390b[i2] = (c0695a3.f2390b[i2] * f) + ((1.0f - f) * fArr[i2]);
                            i2++;
                        }
                    }
                }
                return this.f4317a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x033a, code lost:
        if (r32 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x033c, code lost:
        if (r13 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x033e, code lost:
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x034d, code lost:
        if (r2.hasNext() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x034f, code lost:
        r1[r14] = (android.animation.Animator) r2.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x035b, code lost:
        if (r33 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x035d, code lost:
        r32.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0361, code lost:
        r32.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0364, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0313  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator m9946a(android.content.Context r27, android.content.res.Resources r28, android.content.res.Resources.Theme r29, android.content.res.XmlResourceParser r30, android.util.AttributeSet r31, android.animation.AnimatorSet r32, int r33) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 869
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.C1788f.m9946a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    /* renamed from: b */
    public static Keyframe m9945b(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    /* renamed from: c */
    public static PropertyValuesHolder m9944c(TypedArray typedArray, int i, int i2, int i3, String str) {
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        C1790g c1790g;
        int i6;
        PropertyValuesHolder ofInt;
        int i7;
        int i8;
        float f;
        float f2;
        float f3;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i4 = peekValue.type;
        } else {
            i4 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i3);
        if (peekValue2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i5 = peekValue2.type;
        } else {
            i5 = 0;
        }
        if (i == 4) {
            if ((z && m9943d(i4)) || (z2 && m9943d(i5))) {
                i = 3;
            } else {
                i = 0;
            }
        }
        if (i == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C0694d.C0695a[] m11961c = C0694d.m11961c(string);
            C0694d.C0695a[] m11961c2 = C0694d.m11961c(string2);
            if (m11961c == null && m11961c2 == null) {
                return null;
            }
            if (m11961c != null) {
                C1789a c1789a = new C1789a();
                if (m11961c2 != null) {
                    if (C0694d.m11963a(m11961c, m11961c2)) {
                        ofObject = PropertyValuesHolder.ofObject(str, c1789a, m11961c, m11961c2);
                    } else {
                        throw new InflateException(C0758e.m11827a(" Can't morph from ", string, " to ", string2));
                    }
                } else {
                    ofObject = PropertyValuesHolder.ofObject(str, c1789a, m11961c);
                }
                return ofObject;
            } else if (m11961c2 == null) {
                return null;
            } else {
                return PropertyValuesHolder.ofObject(str, new C1789a(), m11961c2);
            }
        }
        if (i == 3) {
            c1790g = C1790g.f4318a;
        } else {
            c1790g = null;
        }
        if (z3) {
            if (z) {
                if (i4 == 5) {
                    f2 = typedArray.getDimension(i2, 0.0f);
                } else {
                    f2 = typedArray.getFloat(i2, 0.0f);
                }
                if (z2) {
                    if (i5 == 5) {
                        f3 = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f3 = typedArray.getFloat(i3, 0.0f);
                    }
                    ofInt = PropertyValuesHolder.ofFloat(str, f2, f3);
                } else {
                    ofInt = PropertyValuesHolder.ofFloat(str, f2);
                }
            } else {
                if (i5 == 5) {
                    f = typedArray.getDimension(i3, 0.0f);
                } else {
                    f = typedArray.getFloat(i3, 0.0f);
                }
                ofInt = PropertyValuesHolder.ofFloat(str, f);
            }
        } else if (z) {
            if (i4 == 5) {
                i7 = (int) typedArray.getDimension(i2, 0.0f);
            } else if (m9943d(i4)) {
                i7 = typedArray.getColor(i2, 0);
            } else {
                i7 = typedArray.getInt(i2, 0);
            }
            if (z2) {
                if (i5 == 5) {
                    i8 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (m9943d(i5)) {
                    i8 = typedArray.getColor(i3, 0);
                } else {
                    i8 = typedArray.getInt(i3, 0);
                }
                ofInt = PropertyValuesHolder.ofInt(str, i7, i8);
            } else {
                ofInt = PropertyValuesHolder.ofInt(str, i7);
            }
        } else {
            if (z2) {
                if (i5 == 5) {
                    i6 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (m9943d(i5)) {
                    i6 = typedArray.getColor(i3, 0);
                } else {
                    i6 = typedArray.getInt(i3, 0);
                }
                ofInt = PropertyValuesHolder.ofInt(str, i6);
            }
            if (propertyValuesHolder == null && c1790g != null) {
                propertyValuesHolder.setEvaluator(c1790g);
                return propertyValuesHolder;
            }
        }
        propertyValuesHolder = ofInt;
        return propertyValuesHolder == null ? propertyValuesHolder : propertyValuesHolder;
    }

    /* renamed from: d */
    public static boolean m9943d(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: e */
    public static ValueAnimator m9942e(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        boolean z;
        int i;
        boolean z2;
        int i2;
        TypedArray m11973f = C0687i.m11973f(resources, theme, attributeSet, C1780a.f4297g);
        TypedArray m11973f2 = C0687i.m11973f(resources, theme, attributeSet, C1780a.f4301k);
        if (objectAnimator == null) {
            valueAnimator = new ValueAnimator();
        } else {
            valueAnimator = objectAnimator;
        }
        long m11976c = C0687i.m11976c(m11973f, xmlResourceParser, "duration", 1, 300);
        int i3 = 0;
        long m11976c2 = C0687i.m11976c(m11973f, xmlResourceParser, "startOffset", 2, 0);
        int m11976c3 = C0687i.m11976c(m11973f, xmlResourceParser, "valueType", 7, 4);
        if (C0687i.m11974e(xmlResourceParser, "valueFrom") && C0687i.m11974e(xmlResourceParser, "valueTo")) {
            if (m11976c3 == 4) {
                TypedValue peekValue = m11973f.peekValue(5);
                if (peekValue != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i = peekValue.type;
                } else {
                    i = 0;
                }
                TypedValue peekValue2 = m11973f.peekValue(6);
                if (peekValue2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i2 = peekValue2.type;
                } else {
                    i2 = 0;
                }
                if ((z && m9943d(i)) || (z2 && m9943d(i2))) {
                    m11976c3 = 3;
                } else {
                    m11976c3 = 0;
                }
            }
            PropertyValuesHolder m9944c = m9944c(m11973f, m11976c3, 5, 6, "");
            if (m9944c != null) {
                valueAnimator.setValues(m9944c);
            }
        }
        valueAnimator.setDuration(m11976c);
        valueAnimator.setStartDelay(m11976c2);
        valueAnimator.setRepeatCount(C0687i.m11976c(m11973f, xmlResourceParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C0687i.m11976c(m11973f, xmlResourceParser, "repeatMode", 4, 1));
        if (m11973f2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator;
            String m11975d = C0687i.m11975d(m11973f2, xmlResourceParser, "pathData", 1);
            if (m11975d != null) {
                String m11975d2 = C0687i.m11975d(m11973f2, xmlResourceParser, "propertyXName", 2);
                String m11975d3 = C0687i.m11975d(m11973f2, xmlResourceParser, "propertyYName", 3);
                if (m11975d2 == null && m11975d3 == null) {
                    throw new InflateException(m11973f2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path m11960d = C0694d.m11960d(m11975d);
                PathMeasure pathMeasure = new PathMeasure(m11960d, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f = 0.0f;
                do {
                    f += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(m11960d, false);
                int min = Math.min(100, ((int) (f / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f2 = f / (min - 1);
                valueAnimator2 = valueAnimator;
                typedArray = m11973f;
                int i4 = 0;
                float f3 = 0.0f;
                while (true) {
                    propertyValuesHolder = null;
                    if (i3 >= min) {
                        break;
                    }
                    int i5 = min;
                    pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(i4)).floatValue(), fArr3, null);
                    fArr[i3] = fArr3[0];
                    fArr2[i3] = fArr3[1];
                    f3 += f2;
                    int i6 = i4 + 1;
                    if (i6 < arrayList.size() && f3 > ((Float) arrayList.get(i6)).floatValue()) {
                        pathMeasure2.nextContour();
                        i4 = i6;
                    }
                    i3++;
                    min = i5;
                }
                if (m11975d2 != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(m11975d2, fArr);
                } else {
                    propertyValuesHolder2 = null;
                }
                if (m11975d3 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(m11975d3, fArr2);
                }
                if (propertyValuesHolder2 == null) {
                    i3 = 0;
                    objectAnimator2.setValues(propertyValuesHolder);
                } else {
                    i3 = 0;
                    if (propertyValuesHolder == null) {
                        objectAnimator2.setValues(propertyValuesHolder2);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolder2, propertyValuesHolder);
                    }
                }
            } else {
                valueAnimator2 = valueAnimator;
                typedArray = m11973f;
                objectAnimator2.setPropertyName(C0687i.m11975d(m11973f2, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator;
            typedArray = m11973f;
        }
        if (!C0687i.m11974e(xmlResourceParser, "interpolator")) {
            typedArray2 = typedArray;
        } else {
            typedArray2 = typedArray;
            i3 = typedArray2.getResourceId(i3, i3);
        }
        if (i3 > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, i3));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (m11973f2 != null) {
            m11973f2.recycle();
        }
        return valueAnimator3;
    }
}
