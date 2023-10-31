package retrofit2;

import java.io.IOException;
import okhttp3.Request;

/* renamed from: retrofit2.b */
/* loaded from: classes3.dex */
public interface InterfaceC11230b<T> extends Cloneable {
    void cancel();

    /* renamed from: clone */
    InterfaceC11230b<T> mo13249clone();

    /* renamed from: e */
    void mo3e(InterfaceC11241d<T> interfaceC11241d);

    C11245e0<T> execute() throws IOException;

    boolean isCanceled();

    Request request();
}
