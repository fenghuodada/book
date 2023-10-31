package okhttp3;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.markers.InterfaceC10847a;
import kotlin.p061io.C10805a;
import okhttp3.internal.cache.DiskLruCache;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

@Metadata(m509d1 = {"\u0000'\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001e\u0010\n\u001a\f\u0012\b\u0012\u00060\bR\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m508d2 = {"okhttp3/Cache$urls$1", "", "", "", "hasNext", "next", "Lkotlin/p;", "remove", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "delegate", "Ljava/util/Iterator;", "nextUrl", "Ljava/lang/String;", "canRemove", "Z", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Cache$urls$1 implements Iterator<String>, InterfaceC10847a, p060j$.util.Iterator {
    private boolean canRemove;
    private final Iterator<DiskLruCache.Snapshot> delegate;
    private String nextUrl;
    final /* synthetic */ Cache this$0;

    public Cache$urls$1(Cache cache) {
        this.this$0 = cache;
        this.delegate = cache.getCache$okhttp().snapshots();
    }

    @Override // p060j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super String> consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public boolean hasNext() {
        if (this.nextUrl != null) {
            return true;
        }
        this.canRemove = false;
        while (this.delegate.hasNext()) {
            try {
                DiskLruCache.Snapshot next = this.delegate.next();
                this.nextUrl = Okio.buffer(next.getSource(0)).readUtf8LineStrict();
                C10805a.m443a(next, null);
                return true;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    @NotNull
    public String next() {
        if (hasNext()) {
            String str = this.nextUrl;
            C10843j.m433c(str);
            this.nextUrl = null;
            this.canRemove = true;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public void remove() {
        if (!this.canRemove) {
            throw new IllegalStateException("remove() before next()".toString());
        }
        this.delegate.remove();
    }
}
