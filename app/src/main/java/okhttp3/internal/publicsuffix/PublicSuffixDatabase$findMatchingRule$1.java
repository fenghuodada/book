package okhttp3.internal.publicsuffix;

import kotlin.Metadata;
import kotlin.jvm.internal.C10846m;
import org.jetbrains.annotations.Nullable;

@Metadata(m510bv = {1, 0, 3}, m507k = 3, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
final /* synthetic */ class PublicSuffixDatabase$findMatchingRule$1 extends C10846m {
    public PublicSuffixDatabase$findMatchingRule$1(PublicSuffixDatabase publicSuffixDatabase) {
        super(publicSuffixDatabase, PublicSuffixDatabase.class, "publicSuffixListBytes", "getPublicSuffixListBytes()[B", 0);
    }

    @Override // kotlin.jvm.internal.C10846m, kotlin.reflect.InterfaceC10893i
    @Nullable
    public Object get() {
        return PublicSuffixDatabase.access$getPublicSuffixListBytes$p((PublicSuffixDatabase) this.receiver);
    }

    @Override // kotlin.jvm.internal.C10846m
    public void set(@Nullable Object obj) {
        ((PublicSuffixDatabase) this.receiver).publicSuffixListBytes = (byte[]) obj;
    }
}
