package p059go;

import android.content.Context;
import androidx.appcompat.view.menu.C0235r;
import androidx.constraintlayout.core.widgets.C0539e;
import androidx.core.p003os.C0740h;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.logging.Logger;

/* renamed from: go.Seq */
/* loaded from: classes3.dex */
public class Seq {
    private static final int NULL_REFNUM = 41;
    static final RefTracker tracker;
    private static Logger log = Logger.getLogger("GoSeq");
    public static final Ref nullRef = new Ref(41, null);
    private static final GoRefQueue goRefQueue = new GoRefQueue();

    /* renamed from: go.Seq$GoObject */
    /* loaded from: classes3.dex */
    public interface GoObject {
        int incRefnum();
    }

    /* renamed from: go.Seq$GoRef */
    /* loaded from: classes3.dex */
    public static class GoRef extends PhantomReference<GoObject> {
        final int refnum;

        public GoRef(int i, GoObject goObject, GoRefQueue goRefQueue) {
            super(goObject, goRefQueue);
            if (i <= 0) {
                this.refnum = i;
                return;
            }
            throw new RuntimeException(C0235r.m12816a("GoRef instantiated with a Java refnum ", i));
        }
    }

    /* renamed from: go.Seq$GoRefQueue */
    /* loaded from: classes3.dex */
    public static class GoRefQueue extends ReferenceQueue<GoObject> {
        private final Collection<GoRef> refs = Collections.synchronizedCollection(new HashSet());

        public GoRefQueue() {
            Thread thread = new Thread(new Runnable() { // from class: go.Seq.GoRefQueue.1
                @Override // java.lang.Runnable
                public void run() {
                    while (true) {
                        try {
                            GoRef goRef = (GoRef) GoRefQueue.this.remove();
                            GoRefQueue.this.refs.remove(goRef);
                            Seq.destroyRef(goRef.refnum);
                            goRef.clear();
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            });
            thread.setDaemon(true);
            thread.setName("GoRefQueue Finalizer Thread");
            thread.start();
        }

        public void track(int i, GoObject goObject) {
            this.refs.add(new GoRef(i, goObject, this));
        }
    }

    /* renamed from: go.Seq$Proxy */
    /* loaded from: classes3.dex */
    public interface Proxy extends GoObject {
    }

    /* renamed from: go.Seq$Ref */
    /* loaded from: classes3.dex */
    public static final class Ref {
        public final Object obj;
        private int refcnt;
        public final int refnum;

        public Ref(int i, Object obj) {
            if (i >= 0) {
                this.refnum = i;
                this.refcnt = 0;
                this.obj = obj;
                return;
            }
            throw new RuntimeException(C0235r.m12816a("Ref instantiated with a Go refnum ", i));
        }

        public static /* synthetic */ int access$110(Ref ref) {
            int i = ref.refcnt;
            ref.refcnt = i - 1;
            return i;
        }

        public void inc() {
            int i = this.refcnt;
            if (i != Integer.MAX_VALUE) {
                this.refcnt = i + 1;
                return;
            }
            throw new RuntimeException(C0539e.m12264b(new StringBuilder("refnum "), this.refnum, " overflow"));
        }
    }

    /* renamed from: go.Seq$RefMap */
    /* loaded from: classes3.dex */
    public static final class RefMap {
        private int next = 0;
        private int live = 0;
        private int[] keys = new int[16];
        private Ref[] objs = new Ref[16];

        private void grow() {
            Ref[] refArr;
            int roundPow2 = roundPow2(this.live) * 2;
            int[] iArr = this.keys;
            if (roundPow2 > iArr.length) {
                iArr = new int[iArr.length * 2];
                refArr = new Ref[this.objs.length * 2];
            } else {
                refArr = this.objs;
            }
            int i = 0;
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.keys;
                if (i >= iArr2.length) {
                    break;
                }
                Ref ref = this.objs[i];
                if (ref != null) {
                    iArr[i2] = iArr2[i];
                    refArr[i2] = ref;
                    i2++;
                }
                i++;
            }
            for (int i3 = i2; i3 < iArr.length; i3++) {
                iArr[i3] = 0;
                refArr[i3] = null;
            }
            this.keys = iArr;
            this.objs = refArr;
            this.next = i2;
            if (this.live == i2) {
                return;
            }
            throw new RuntimeException("bad state: live=" + this.live + ", next=" + this.next);
        }

        private static int roundPow2(int i) {
            int i2 = 1;
            while (i2 < i) {
                i2 *= 2;
            }
            return i2;
        }

        public Ref get(int i) {
            int binarySearch = Arrays.binarySearch(this.keys, 0, this.next, i);
            if (binarySearch >= 0) {
                return this.objs[binarySearch];
            }
            return null;
        }

        public void put(int i, Ref ref) {
            if (ref != null) {
                int binarySearch = Arrays.binarySearch(this.keys, 0, this.next, i);
                if (binarySearch >= 0) {
                    Ref[] refArr = this.objs;
                    if (refArr[binarySearch] == null) {
                        refArr[binarySearch] = ref;
                        this.live++;
                    }
                    if (refArr[binarySearch] == ref) {
                        return;
                    }
                    throw new RuntimeException(C0740h.m11849a("replacing an existing ref (with key ", i, ")"));
                }
                if (this.next >= this.keys.length) {
                    grow();
                    binarySearch = Arrays.binarySearch(this.keys, 0, this.next, i);
                }
                int i2 = ~binarySearch;
                int i3 = this.next;
                if (i2 < i3) {
                    int[] iArr = this.keys;
                    int i4 = i2 + 1;
                    System.arraycopy(iArr, i2, iArr, i4, i3 - i2);
                    Ref[] refArr2 = this.objs;
                    System.arraycopy(refArr2, i2, refArr2, i4, this.next - i2);
                }
                this.keys[i2] = i;
                this.objs[i2] = ref;
                this.live++;
                this.next++;
                return;
            }
            throw new RuntimeException(C0740h.m11849a("put a null ref (with key ", i, ")"));
        }

        public void remove(int i) {
            int binarySearch = Arrays.binarySearch(this.keys, 0, this.next, i);
            if (binarySearch >= 0) {
                Ref[] refArr = this.objs;
                if (refArr[binarySearch] != null) {
                    refArr[binarySearch] = null;
                    this.live--;
                }
            }
        }
    }

    /* renamed from: go.Seq$RefTracker */
    /* loaded from: classes3.dex */
    public static final class RefTracker {
        private static final int REF_OFFSET = 42;
        private int next = 42;
        private final RefMap javaObjs = new RefMap();
        private final IdentityHashMap<Object, Integer> javaRefs = new IdentityHashMap<>();

        public synchronized void dec(int i) {
            if (i <= 0) {
                Logger logger = Seq.log;
                logger.severe("dec request for Go object " + i);
            } else if (i == Seq.nullRef.refnum) {
            } else {
                Ref ref = this.javaObjs.get(i);
                if (ref == null) {
                    throw new RuntimeException("referenced Java object is not found: refnum=" + i);
                }
                Ref.access$110(ref);
                if (ref.refcnt <= 0) {
                    this.javaObjs.remove(i);
                    this.javaRefs.remove(ref.obj);
                }
            }
        }

        public synchronized Ref get(int i) {
            if (i < 0) {
                throw new RuntimeException("ref called with Go refnum " + i);
            } else if (i == 41) {
                return Seq.nullRef;
            } else {
                Ref ref = this.javaObjs.get(i);
                if (ref != null) {
                    return ref;
                }
                throw new RuntimeException("unknown java Ref: " + i);
            }
        }

        public synchronized int inc(Object obj) {
            if (obj == null) {
                return 41;
            }
            if (obj instanceof Proxy) {
                return ((Proxy) obj).incRefnum();
            }
            Integer num = this.javaRefs.get(obj);
            if (num == null) {
                int i = this.next;
                if (i == Integer.MAX_VALUE) {
                    throw new RuntimeException("createRef overflow for " + obj);
                }
                this.next = i + 1;
                num = Integer.valueOf(i);
                this.javaRefs.put(obj, num);
            }
            int intValue = num.intValue();
            Ref ref = this.javaObjs.get(intValue);
            if (ref == null) {
                ref = new Ref(intValue, obj);
                this.javaObjs.put(intValue, ref);
            }
            ref.inc();
            return intValue;
        }

        public synchronized void incRefnum(int i) {
            Ref ref = this.javaObjs.get(i);
            if (ref == null) {
                throw new RuntimeException("referenced Java object is not found: refnum=" + i);
            }
            ref.inc();
        }
    }

    static {
        System.loadLibrary("gojni");
        init();
        Universe.touch();
        tracker = new RefTracker();
    }

    private Seq() {
    }

    public static void decRef(int i) {
        tracker.dec(i);
    }

    public static native void destroyRef(int i);

    public static Ref getRef(int i) {
        return tracker.get(i);
    }

    public static int incGoObjectRef(GoObject goObject) {
        return goObject.incRefnum();
    }

    public static native void incGoRef(int i, GoObject goObject);

    public static int incRef(Object obj) {
        return tracker.inc(obj);
    }

    public static void incRefnum(int i) {
        tracker.incRefnum(i);
    }

    private static native void init();

    public static void setContext(Context context) {
        setContext((Object) context);
    }

    public static native void setContext(Object obj);

    public static void touch() {
    }

    public static void trackGoRef(int i, GoObject goObject) {
        if (i <= 0) {
            goRefQueue.track(i, goObject);
            return;
        }
        throw new RuntimeException(C0235r.m12816a("trackGoRef called with Java refnum ", i));
    }
}
