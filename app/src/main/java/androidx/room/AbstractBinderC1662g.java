package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: androidx.room.g */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1662g extends Binder implements IInterface {
    public AbstractBinderC1662g() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        InterfaceC1661f interfaceC1661f = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                    return true;
                }
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                MultiInstanceInvalidationService.BinderC1655b binderC1655b = (MultiInstanceInvalidationService.BinderC1655b) this;
                binderC1655b.m10087d(parcel.createStringArray(), parcel.readInt());
                return true;
            }
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC1661f)) {
                    interfaceC1661f = (InterfaceC1661f) queryLocalInterface;
                } else {
                    interfaceC1661f = new C1660e(readStrongBinder);
                }
            }
            int readInt = parcel.readInt();
            MultiInstanceInvalidationService.BinderC1655b binderC1655b2 = (MultiInstanceInvalidationService.BinderC1655b) this;
            synchronized (MultiInstanceInvalidationService.this.f4016c) {
                MultiInstanceInvalidationService.this.f4016c.unregister(interfaceC1661f);
                MultiInstanceInvalidationService.this.f4015b.remove(Integer.valueOf(readInt));
            }
            parcel2.writeNoException();
            return true;
        }
        parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof InterfaceC1661f)) {
                interfaceC1661f = (InterfaceC1661f) queryLocalInterface2;
            } else {
                interfaceC1661f = new C1660e(readStrongBinder2);
            }
        }
        int m10086e = ((MultiInstanceInvalidationService.BinderC1655b) this).m10086e(interfaceC1661f, parcel.readString());
        parcel2.writeNoException();
        parcel2.writeInt(m10086e);
        return true;
    }
}
