package p059go;

import p059go.Seq;

/* renamed from: go.Universe */
/* loaded from: classes3.dex */
public abstract class Universe {

    /* renamed from: go.Universe$proxyerror */
    /* loaded from: classes3.dex */
    public static final class proxyerror extends Exception implements Seq.Proxy, InterfaceC10139error {
        private final int refnum;

        public proxyerror(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        @Override // p059go.InterfaceC10139error
        public native String error();

        @Override // java.lang.Throwable
        public String getMessage() {
            return error();
        }

        @Override // p059go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }
    }

    static {
        Seq.touch();
        _init();
    }

    private Universe() {
    }

    private static native void _init();

    public static void touch() {
    }
}
