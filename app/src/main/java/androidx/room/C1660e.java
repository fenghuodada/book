package androidx.room;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: androidx.room.e */
/* loaded from: classes.dex */
public final class C1660e implements InterfaceC1661f {

    /* renamed from: a */
    public final IBinder f4033a;

    public C1660e(IBinder iBinder) {
        this.f4033a = iBinder;
    }

    @Override // androidx.room.InterfaceC1661f
    /* renamed from: a */
    public final void mo10083a(String[] strArr) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            obtain.writeStringArray(strArr);
            this.f4033a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4033a;
    }
}
