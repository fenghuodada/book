package android.support.p000v4.p001os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p000v4.p001os.InterfaceC0018a;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: android.support.v4.os.b */
/* loaded from: classes.dex */
public class C0021b implements Parcelable {
    public static final Parcelable.Creator<C0021b> CREATOR = new C0022a();

    /* renamed from: a */
    public InterfaceC0018a f43a;

    /* renamed from: android.support.v4.os.b$a */
    /* loaded from: classes.dex */
    public class C0022a implements Parcelable.Creator<C0021b> {
        @Override // android.os.Parcelable.Creator
        public final C0021b createFromParcel(Parcel parcel) {
            return new C0021b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C0021b[] newArray(int i) {
            return new C0021b[i];
        }
    }

    /* renamed from: android.support.v4.os.b$b */
    /* loaded from: classes.dex */
    public class BinderC0023b extends InterfaceC0018a.AbstractBinderC0019a {
        public BinderC0023b() {
        }
    }

    public C0021b(Parcel parcel) {
        InterfaceC0018a c0020a;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i = InterfaceC0018a.AbstractBinderC0019a.f41a;
        if (readStrongBinder == null) {
            c0020a = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0018a)) {
                c0020a = (InterfaceC0018a) queryLocalInterface;
            } else {
                c0020a = new InterfaceC0018a.AbstractBinderC0019a.C0020a(readStrongBinder);
            }
        }
        this.f43a = c0020a;
    }

    /* renamed from: b */
    public void mo13070b(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        synchronized (this) {
            if (this.f43a == null) {
                this.f43a = new BinderC0023b();
            }
            parcel.writeStrongBinder(this.f43a.asBinder());
        }
    }
}
