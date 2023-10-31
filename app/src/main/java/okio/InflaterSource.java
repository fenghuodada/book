package okio;

import com.applovin.impl.sdk.p033e.C3132a0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bB\u0019\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m508d2 = {"Lokio/InflaterSource;", "Lokio/Source;", "Lkotlin/p;", "releaseBytesAfterInflate", "Lokio/Buffer;", "sink", "", "byteCount", "read", "readOrInflate", "", "refill", "Lokio/Timeout;", "timeout", "close", "", "bufferBytesHeldByInflater", "I", "closed", "Z", "Lokio/BufferedSource;", FirebaseAnalytics.Param.SOURCE, "Lokio/BufferedSource;", "Ljava/util/zip/Inflater;", "inflater", "Ljava/util/zip/Inflater;", "<init>", "(Lokio/BufferedSource;Ljava/util/zip/Inflater;)V", "(Lokio/Source;Ljava/util/zip/Inflater;)V", "okio"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class InflaterSource implements Source {
    private int bufferBytesHeldByInflater;
    private boolean closed;
    private final Inflater inflater;
    private final BufferedSource source;

    public InflaterSource(@NotNull BufferedSource source, @NotNull Inflater inflater) {
        C10843j.m430f(source, "source");
        C10843j.m430f(inflater, "inflater");
        this.source = source;
        this.inflater = inflater;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InflaterSource(@NotNull Source source, @NotNull Inflater inflater) {
        this(Okio.buffer(source), inflater);
        C10843j.m430f(source, "source");
        C10843j.m430f(inflater, "inflater");
    }

    private final void releaseBytesAfterInflate() {
        int i = this.bufferBytesHeldByInflater;
        if (i == 0) {
            return;
        }
        int remaining = i - this.inflater.getRemaining();
        this.bufferBytesHeldByInflater -= remaining;
        this.source.skip(remaining);
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.inflater.end();
        this.closed = true;
        this.source.close();
    }

    @Override // okio.Source
    public long read(@NotNull Buffer sink, long j) throws IOException {
        C10843j.m430f(sink, "sink");
        do {
            long readOrInflate = readOrInflate(sink, j);
            if (readOrInflate > 0) {
                return readOrInflate;
            }
            if (this.inflater.finished() || this.inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.source.exhausted());
        throw new EOFException("source exhausted prematurely");
    }

    public final long readOrInflate(@NotNull Buffer sink, long j) throws IOException {
        boolean z;
        C10843j.m430f(sink, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!this.closed) {
                if (i == 0) {
                    return 0L;
                }
                try {
                    Segment writableSegment$okio = sink.writableSegment$okio(1);
                    refill();
                    int inflate = this.inflater.inflate(writableSegment$okio.data, writableSegment$okio.limit, (int) Math.min(j, 8192 - writableSegment$okio.limit));
                    releaseBytesAfterInflate();
                    if (inflate > 0) {
                        writableSegment$okio.limit += inflate;
                        long j2 = inflate;
                        sink.setSize$okio(sink.size() + j2);
                        return j2;
                    }
                    if (writableSegment$okio.pos == writableSegment$okio.limit) {
                        sink.head = writableSegment$okio.pop();
                        SegmentPool.recycle(writableSegment$okio);
                    }
                    return 0L;
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(C3132a0.m7696a("byteCount < 0: ", j).toString());
    }

    public final boolean refill() throws IOException {
        if (this.inflater.needsInput()) {
            if (this.source.exhausted()) {
                return true;
            }
            Segment segment = this.source.getBuffer().head;
            C10843j.m433c(segment);
            int i = segment.limit;
            int i2 = segment.pos;
            int i3 = i - i2;
            this.bufferBytesHeldByInflater = i3;
            this.inflater.setInput(segment.data, i2, i3);
            return false;
        }
        return false;
    }

    @Override // okio.Source
    @NotNull
    public Timeout timeout() {
        return this.source.timeout();
    }
}
