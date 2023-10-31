package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.emoji2.text.EmojiCompat;

/* renamed from: androidx.emoji2.viewsintegration.f */
/* loaded from: classes.dex */
public final class C1337f {

    /* renamed from: a */
    public final C1339b f3241a;

    @RequiresApi(19)
    /* renamed from: androidx.emoji2.viewsintegration.f$a */
    /* loaded from: classes.dex */
    public static class C1338a extends C1339b {

        /* renamed from: a */
        public final TextView f3242a;

        /* renamed from: b */
        public final C1333d f3243b;

        /* renamed from: c */
        public boolean f3244c = true;

        public C1338a(TextView textView) {
            this.f3242a = textView;
            this.f3243b = new C1333d(textView);
        }

        @Override // androidx.emoji2.viewsintegration.C1337f.C1339b
        @NonNull
        /* renamed from: a */
        public final InputFilter[] mo10651a(@NonNull InputFilter[] inputFilterArr) {
            if (!this.f3244c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i = 0; i < inputFilterArr.length; i++) {
                    InputFilter inputFilter = inputFilterArr[i];
                    if (inputFilter instanceof C1333d) {
                        sparseArray.put(i, inputFilter);
                    }
                }
                if (sparseArray.size() != 0) {
                    int length = inputFilterArr.length;
                    InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                    int i2 = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        if (sparseArray.indexOfKey(i3) < 0) {
                            inputFilterArr2[i2] = inputFilterArr[i3];
                            i2++;
                        }
                    }
                    return inputFilterArr2;
                }
                return inputFilterArr;
            }
            int length2 = inputFilterArr.length;
            int i4 = 0;
            while (true) {
                C1333d c1333d = this.f3243b;
                if (i4 < length2) {
                    if (inputFilterArr[i4] != c1333d) {
                        i4++;
                    } else {
                        return inputFilterArr;
                    }
                } else {
                    InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = c1333d;
                    return inputFilterArr3;
                }
            }
        }

        @Override // androidx.emoji2.viewsintegration.C1337f.C1339b
        /* renamed from: b */
        public final boolean mo10650b() {
            return this.f3244c;
        }

        @Override // androidx.emoji2.viewsintegration.C1337f.C1339b
        /* renamed from: c */
        public final void mo10649c(boolean z) {
            if (z) {
                TextView textView = this.f3242a;
                textView.setTransformationMethod(mo10647e(textView.getTransformationMethod()));
            }
        }

        @Override // androidx.emoji2.viewsintegration.C1337f.C1339b
        /* renamed from: d */
        public final void mo10648d(boolean z) {
            this.f3244c = z;
            TextView textView = this.f3242a;
            textView.setTransformationMethod(mo10647e(textView.getTransformationMethod()));
            textView.setFilters(mo10651a(textView.getFilters()));
        }

        @Override // androidx.emoji2.viewsintegration.C1337f.C1339b
        @Nullable
        /* renamed from: e */
        public final TransformationMethod mo10647e(@Nullable TransformationMethod transformationMethod) {
            if (this.f3244c) {
                if (!(transformationMethod instanceof C1343h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                    return new C1343h(transformationMethod);
                }
                return transformationMethod;
            } else if (transformationMethod instanceof C1343h) {
                return ((C1343h) transformationMethod).f3251a;
            } else {
                return transformationMethod;
            }
        }
    }

    /* renamed from: androidx.emoji2.viewsintegration.f$b */
    /* loaded from: classes.dex */
    public static class C1339b {
        @NonNull
        /* renamed from: a */
        public InputFilter[] mo10651a(@NonNull InputFilter[] inputFilterArr) {
            throw null;
        }

        /* renamed from: b */
        public boolean mo10650b() {
            throw null;
        }

        /* renamed from: c */
        public void mo10649c(boolean z) {
            throw null;
        }

        /* renamed from: d */
        public void mo10648d(boolean z) {
            throw null;
        }

        @Nullable
        /* renamed from: e */
        public TransformationMethod mo10647e(@Nullable TransformationMethod transformationMethod) {
            throw null;
        }
    }

    @RequiresApi(19)
    /* renamed from: androidx.emoji2.viewsintegration.f$c */
    /* loaded from: classes.dex */
    public static class C1340c extends C1339b {

        /* renamed from: a */
        public final C1338a f3245a;

        public C1340c(TextView textView) {
            this.f3245a = new C1338a(textView);
        }

        @Override // androidx.emoji2.viewsintegration.C1337f.C1339b
        @NonNull
        /* renamed from: a */
        public final InputFilter[] mo10651a(@NonNull InputFilter[] inputFilterArr) {
            boolean z;
            if (EmojiCompat.f3154j != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return inputFilterArr;
            }
            return this.f3245a.mo10651a(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.C1337f.C1339b
        /* renamed from: b */
        public final boolean mo10650b() {
            return this.f3245a.f3244c;
        }

        @Override // androidx.emoji2.viewsintegration.C1337f.C1339b
        /* renamed from: c */
        public final void mo10649c(boolean z) {
            boolean z2;
            if (EmojiCompat.f3154j != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return;
            }
            this.f3245a.mo10649c(z);
        }

        @Override // androidx.emoji2.viewsintegration.C1337f.C1339b
        /* renamed from: d */
        public final void mo10648d(boolean z) {
            boolean z2;
            if (EmojiCompat.f3154j != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = !z2;
            C1338a c1338a = this.f3245a;
            if (z3) {
                c1338a.f3244c = z;
            } else {
                c1338a.mo10648d(z);
            }
        }

        @Override // androidx.emoji2.viewsintegration.C1337f.C1339b
        @Nullable
        /* renamed from: e */
        public final TransformationMethod mo10647e(@Nullable TransformationMethod transformationMethod) {
            boolean z;
            if (EmojiCompat.f3154j != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return transformationMethod;
            }
            return this.f3245a.mo10647e(transformationMethod);
        }
    }

    public C1337f(@NonNull TextView textView) {
        if (textView != null) {
            this.f3241a = new C1340c(textView);
            return;
        }
        throw new NullPointerException("textView cannot be null");
    }
}
