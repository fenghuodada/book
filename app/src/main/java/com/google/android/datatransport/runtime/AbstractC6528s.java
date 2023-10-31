package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.backends.AbstractC6484f;
import com.google.android.datatransport.runtime.dagger.Component;
import com.google.android.datatransport.runtime.scheduling.AbstractC6534f;
import com.google.android.datatransport.runtime.scheduling.AbstractC6536h;
import com.google.android.datatransport.runtime.scheduling.persistence.AbstractC6578f;
import com.google.android.datatransport.runtime.time.AbstractC6612b;
import java.io.Closeable;
import java.io.IOException;
import javax.inject.Singleton;

@Singleton
@Component(modules = {AbstractC6484f.class, AbstractC6578f.class, AbstractC6514i.class, AbstractC6536h.class, AbstractC6534f.class, AbstractC6612b.class})
/* renamed from: com.google.android.datatransport.runtime.s */
/* loaded from: classes.dex */
public abstract class AbstractC6528s implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((C6501e) this).f10242e.get().close();
    }
}
