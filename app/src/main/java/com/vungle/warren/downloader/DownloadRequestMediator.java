package com.vungle.warren.downloader;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.C0800d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import p060j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
@Keep
/* loaded from: classes3.dex */
public class DownloadRequestMediator {
    public final String filePath;
    public final boolean isCacheable;
    public final String key;
    public final String metaPath;
    public final C9777d priority;
    public final String url;
    private AtomicInteger statusAtomic = new AtomicInteger(0);
    private Map<String, C0800d<DownloadRequest, AssetDownloadListener>> children = new ConcurrentHashMap(1);
    private final ReentrantLock lock = new ReentrantLock();
    private AtomicBoolean connectedAtomic = new AtomicBoolean(true);
    private AtomicReference<Runnable> runnable = new AtomicReference<>();

    public DownloadRequestMediator(@NonNull DownloadRequest downloadRequest, @Nullable AssetDownloadListener assetDownloadListener, @NonNull String str, @NonNull String str2, boolean z, String str3) {
        this.url = downloadRequest.f19476b;
        this.filePath = str;
        this.metaPath = str2;
        this.isCacheable = z;
        this.key = str3;
        this.priority = downloadRequest.f19479e.get();
        this.children.put(downloadRequest.f19480f, new C0800d<>(downloadRequest, assetDownloadListener));
    }

    public synchronized void add(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener) {
        this.children.put(downloadRequest.f19480f, new C0800d<>(downloadRequest, assetDownloadListener));
    }

    public C9777d getPriority() {
        C9777d c9777d;
        C9777d c9777d2 = new C9777d(Integer.MAX_VALUE, Integer.MAX_VALUE);
        for (C0800d<DownloadRequest, AssetDownloadListener> c0800d : values()) {
            DownloadRequest downloadRequest = c0800d.f2500a;
            if (downloadRequest != null && (c9777d = downloadRequest.f19479e.get()) != null && c9777d2.compareTo(c9777d) >= 0) {
                c9777d2 = c9777d;
            }
        }
        return c9777d2;
    }

    public Runnable getRunnable() {
        return this.runnable.get();
    }

    @Status
    public int getStatus() {
        return this.statusAtomic.get();
    }

    /* renamed from: is */
    public boolean m1545is(@Status int i) {
        return this.statusAtomic.get() == i;
    }

    public boolean isConnected() {
        return this.connectedAtomic.get();
    }

    public boolean isPausable() {
        for (C0800d<DownloadRequest, AssetDownloadListener> c0800d : values()) {
            DownloadRequest downloadRequest = c0800d.f2500a;
            if (downloadRequest != null && downloadRequest.f19478d) {
                return true;
            }
        }
        return false;
    }

    public void lock() {
        this.lock.lock();
    }

    public synchronized C0800d<DownloadRequest, AssetDownloadListener> remove(DownloadRequest downloadRequest) {
        return this.children.remove(downloadRequest.f19480f);
    }

    public synchronized List<DownloadRequest> requests() {
        ArrayList arrayList;
        List<C0800d<DownloadRequest, AssetDownloadListener>> values = values();
        arrayList = new ArrayList();
        for (C0800d<DownloadRequest, AssetDownloadListener> c0800d : values) {
            arrayList.add(c0800d.f2500a);
        }
        return arrayList;
    }

    public void set(@Status int i) {
        if (this.statusAtomic.get() == 3) {
            return;
        }
        this.statusAtomic.set(i);
    }

    public void setConnected(boolean z) {
        this.connectedAtomic.set(z);
    }

    public void setRunnable(Runnable runnable) {
        this.runnable.set(runnable);
    }

    public void unlock() {
        this.lock.unlock();
    }

    public synchronized List<C0800d<DownloadRequest, AssetDownloadListener>> values() {
        return new ArrayList(this.children.values());
    }
}
