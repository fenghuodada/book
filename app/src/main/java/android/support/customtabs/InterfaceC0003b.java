package android.support.customtabs;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.browser.customtabs.BinderC0458a;

/* renamed from: android.support.customtabs.b */
/* loaded from: classes.dex */
public interface InterfaceC0003b extends IInterface {

    /* renamed from: android.support.customtabs.b$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0004a extends Binder implements InterfaceC0003b {

        /* renamed from: a */
        public static final /* synthetic */ int f0a = 0;

        /* renamed from: android.support.customtabs.b$a$a */
        /* loaded from: classes.dex */
        public static class C0005a implements InterfaceC0003b {

            /* renamed from: a */
            public final IBinder f1a;

            public C0005a(IBinder iBinder) {
                this.f1a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f1a;
            }

            @Override // android.support.customtabs.InterfaceC0003b
            /* renamed from: b */
            public final boolean mo13076b(BinderC0458a binderC0458a) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(binderC0458a);
                    if (!this.f1a.transact(3, obtain, obtain2, 0)) {
                        int i = AbstractBinderC0004a.f0a;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.InterfaceC0003b
            /* renamed from: c */
            public final boolean mo13075c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(0L);
                    if (!this.f1a.transact(2, obtain, obtain2, 0)) {
                        int i = AbstractBinderC0004a.f0a;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    /* renamed from: b */
    boolean mo13076b(BinderC0458a binderC0458a) throws RemoteException;

    /* renamed from: c */
    boolean mo13075c() throws RemoteException;
}
