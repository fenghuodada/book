package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.data.InterfaceC3454e;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder implements InterfaceC3454e<ParcelFileDescriptor> {

    /* renamed from: a */
    public final InternalRewinder f9191a;

    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static final class InternalRewinder {

        /* renamed from: a */
        public final ParcelFileDescriptor f9192a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f9192a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException {
            ParcelFileDescriptor parcelFileDescriptor = this.f9192a;
            try {
                Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return parcelFileDescriptor;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    @RequiresApi(21)
    /* renamed from: com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a */
    /* loaded from: classes.dex */
    public static final class C3448a implements InterfaceC3454e.InterfaceC3455a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.InterfaceC3454e.InterfaceC3455a
        @NonNull
        /* renamed from: a */
        public final Class<ParcelFileDescriptor> mo6524a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3454e.InterfaceC3455a
        @NonNull
        /* renamed from: b */
        public final InterfaceC3454e<ParcelFileDescriptor> mo6523b(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    @RequiresApi(21)
    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f9191a = new InternalRewinder(parcelFileDescriptor);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3454e
    /* renamed from: b */
    public final void mo6525b() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3454e
    @NonNull
    @RequiresApi(21)
    /* renamed from: c */
    public final ParcelFileDescriptor mo6526a() throws IOException {
        return this.f9191a.rewind();
    }
}
