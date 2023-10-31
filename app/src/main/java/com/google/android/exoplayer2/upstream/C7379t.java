package com.google.android.exoplayer2.upstream;

import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.upstream.t */
/* loaded from: classes.dex */
public final class C7379t extends HttpDataSource$HttpDataSourceException {
    public C7379t(IOException iOException) {
        super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, 2007);
    }
}
