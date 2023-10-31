package androidx.datastore.core;

import androidx.datastore.preferences.protobuf.C1163c0;
import java.io.IOException;
import org.jetbrains.annotations.Nullable;

/* renamed from: androidx.datastore.core.a */
/* loaded from: classes.dex */
public final class C1085a extends IOException {
    public C1085a(@Nullable C1163c0 c1163c0) {
        super("Unable to parse preferences proto.", c1163c0);
    }

    public C1085a(String str) {
        super(str, null);
    }
}
