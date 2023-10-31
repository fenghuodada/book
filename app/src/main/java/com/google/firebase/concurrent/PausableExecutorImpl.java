package com.google.firebase.concurrent;

import androidx.annotation.VisibleForTesting;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes3.dex */
final class PausableExecutorImpl implements PausableExecutor {
    private final Executor delegate;
    private volatile boolean paused;
    @VisibleForTesting
    final LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();

    public PausableExecutorImpl(boolean z, Executor executor) {
        this.paused = z;
        this.delegate = executor;
    }

    private void maybeEnqueueNext() {
        if (this.paused) {
            return;
        }
        while (true) {
            for (Runnable poll = this.queue.poll(); poll != null; poll = null) {
                this.delegate.execute(poll);
                if (!this.paused) {
                    break;
                }
            }
            return;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.queue.offer(runnable);
        maybeEnqueueNext();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public boolean isPaused() {
        return this.paused;
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void pause() {
        this.paused = true;
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void resume() {
        this.paused = false;
        maybeEnqueueNext();
    }
}
