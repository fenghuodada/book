package androidx.customview.view;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.customview.view.a */
/* loaded from: classes.dex */
public abstract class AbstractC1068a implements Parcelable {

    /* renamed from: a */
    public final Parcelable f2747a;

    /* renamed from: b */
    public static final C1069a f2746b = new C1069a();
    public static final Parcelable.Creator<AbstractC1068a> CREATOR = new C1070b();

    /* renamed from: androidx.customview.view.a$a */
    /* loaded from: classes.dex */
    public class C1069a extends AbstractC1068a {
    }

    public AbstractC1068a() {
        this.f2747a = null;
    }

    public AbstractC1068a(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f2747a = readParcelable == null ? f2746b : readParcelable;
    }

    public AbstractC1068a(@NonNull Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f2747a = parcelable == f2746b ? null : parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2747a, i);
    }

    /* renamed from: androidx.customview.view.a$b */
    /* loaded from: classes.dex */
    public class C1070b implements Parcelable.ClassLoaderCreator<AbstractC1068a> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return AbstractC1068a.f2746b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AbstractC1068a[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final AbstractC1068a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC1068a.f2746b;
            }
            throw new IllegalStateException("superState must be null");
        }
    }
}
