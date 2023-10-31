package android.support.p000v4.p001os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: android.support.v4.os.a */
/* loaded from: classes.dex */
public interface InterfaceC0018a extends IInterface {

    /* renamed from: android.support.v4.os.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0019a extends Binder implements InterfaceC0018a {

        /* renamed from: a */
        public static final /* synthetic */ int f41a = 0;

        /* renamed from: android.support.v4.os.a$a$a */
        /* loaded from: classes.dex */
        public static class C0020a implements InterfaceC0018a {

            /* renamed from: a */
            public final IBinder f42a;

            public C0020a(IBinder iBinder) {
                this.f42a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f42a;
            }
        }

        public AbstractBinderC0019a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Object obj;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            }
            if (i != 1598968902) {
                if (i != 1) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                int readInt = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator.createFromParcel(parcel);
                } else {
                    obj = null;
                }
                C0021b c0021b = C0021b.this;
                c0021b.getClass();
                c0021b.mo13070b(readInt, (Bundle) obj);
                return true;
            }
            parcel2.writeString("android.support.v4.os.IResultReceiver");
            return true;
        }
    }
}
