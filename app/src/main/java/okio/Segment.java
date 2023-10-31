package okio;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C10751g;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\t\b\u0016¢\u0006\u0004\b\u001b\u0010\u001cB1\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001dJ\u0006\u0010\u0002\u001a\u00020\u0000J\u0006\u0010\u0003\u001a\u00020\u0000J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001f"}, m508d2 = {"Lokio/Segment;", "", "sharedCopy", "unsharedCopy", "pop", "segment", "push", "", "byteCount", "split", "Lkotlin/p;", "compact", "sink", "writeTo", "", "data", "[B", "pos", "I", "limit", "", "shared", "Z", "owner", "next", "Lokio/Segment;", "prev", "<init>", "()V", "([BIIZZ)V", "Companion", "okio"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Segment {
    public static final Companion Companion = new Companion(null);
    public static final int SHARE_MINIMUM = 1024;
    public static final int SIZE = 8192;
    @JvmField
    @NotNull
    public final byte[] data;
    @JvmField
    public int limit;
    @JvmField
    @Nullable
    public Segment next;
    @JvmField
    public boolean owner;
    @JvmField
    public int pos;
    @JvmField
    @Nullable
    public Segment prev;
    @JvmField
    public boolean shared;

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m508d2 = {"Lokio/Segment$Companion;", "", "()V", "SHARE_MINIMUM", "", "SIZE", "okio"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }
    }

    public Segment() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }

    public Segment(@NotNull byte[] data, int i, int i2, boolean z, boolean z2) {
        C10843j.m430f(data, "data");
        this.data = data;
        this.pos = i;
        this.limit = i2;
        this.shared = z;
        this.owner = z2;
    }

    public final void compact() {
        Segment segment = this.prev;
        int i = 0;
        if (!(segment != this)) {
            throw new IllegalStateException("cannot compact".toString());
        }
        C10843j.m433c(segment);
        if (segment.owner) {
            int i2 = this.limit - this.pos;
            Segment segment2 = this.prev;
            C10843j.m433c(segment2);
            int i3 = 8192 - segment2.limit;
            Segment segment3 = this.prev;
            C10843j.m433c(segment3);
            if (!segment3.shared) {
                Segment segment4 = this.prev;
                C10843j.m433c(segment4);
                i = segment4.pos;
            }
            if (i2 > i3 + i) {
                return;
            }
            Segment segment5 = this.prev;
            C10843j.m433c(segment5);
            writeTo(segment5, i2);
            pop();
            SegmentPool.recycle(this);
        }
    }

    @Nullable
    public final Segment pop() {
        Segment segment = this.next;
        if (segment == this) {
            segment = null;
        }
        Segment segment2 = this.prev;
        C10843j.m433c(segment2);
        segment2.next = this.next;
        Segment segment3 = this.next;
        C10843j.m433c(segment3);
        segment3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return segment;
    }

    @NotNull
    public final Segment push(@NotNull Segment segment) {
        C10843j.m430f(segment, "segment");
        segment.prev = this;
        segment.next = this.next;
        Segment segment2 = this.next;
        C10843j.m433c(segment2);
        segment2.prev = segment;
        this.next = segment;
        return segment;
    }

    @NotNull
    public final Segment sharedCopy() {
        this.shared = true;
        return new Segment(this.data, this.pos, this.limit, true, false);
    }

    @NotNull
    public final Segment split(int i) {
        boolean z;
        Segment segment;
        if (i > 0 && i <= this.limit - this.pos) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i >= 1024) {
                segment = sharedCopy();
            } else {
                Segment take = SegmentPool.take();
                byte[] bArr = this.data;
                byte[] bArr2 = take.data;
                int i2 = this.pos;
                C10751g.m494b(bArr, 0, bArr2, i2, i2 + i);
                segment = take;
            }
            segment.limit = segment.pos + i;
            this.pos += i;
            Segment segment2 = this.prev;
            C10843j.m433c(segment2);
            segment2.push(segment);
            return segment;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    @NotNull
    public final Segment unsharedCopy() {
        byte[] bArr = this.data;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C10843j.m431e(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new Segment(copyOf, this.pos, this.limit, false, true);
    }

    public final void writeTo(@NotNull Segment sink, int i) {
        C10843j.m430f(sink, "sink");
        if (sink.owner) {
            int i2 = sink.limit;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!sink.shared) {
                    int i4 = sink.pos;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = sink.data;
                        C10751g.m494b(bArr, 0, bArr, i4, i2);
                        sink.limit -= sink.pos;
                        sink.pos = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.data;
            byte[] bArr3 = sink.data;
            int i5 = sink.limit;
            int i6 = this.pos;
            C10751g.m494b(bArr2, i5, bArr3, i6, i6 + i);
            sink.limit += i;
            this.pos += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }
}
