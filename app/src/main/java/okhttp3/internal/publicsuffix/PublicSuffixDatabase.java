package okhttp3.internal.publicsuffix;

import androidx.core.p003os.C0740h;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.collections.C10752h;
import kotlin.collections.C10756l;
import kotlin.collections.C10757m;
import kotlin.collections.C10759o;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import kotlin.p061io.C10805a;
import kotlin.sequences.C10899b;
import kotlin.sequences.InterfaceC10901c;
import kotlin.sequences.InterfaceC10902d;
import kotlin.text.C10919h;
import kotlin.text.C10929r;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016¨\u0006\u001a"}, m508d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "", "domain", "", "splitDomain", "domainLabels", "findMatchingRule", "Lkotlin/p;", "readTheListUninterruptibly", "readTheList", "getEffectiveTldPlusOne", "", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "setListBytes", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "Ljava/util/concurrent/CountDownLatch;", "[B", "<init>", "()V", "Companion", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    @NotNull
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    public static final Companion Companion = new Companion(null);
    private static final byte[] WILDCARD_LABEL = {(byte) 42};
    private static final List<String> PREVAILING_RULE = C10752h.m486c("*");
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\fJ)\u0010\u000e\u001a\u0004\u0018\u00010\u0007*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m508d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "()V", "EXCEPTION_MARKER", "", "PREVAILING_RULE", "", "", "PUBLIC_SUFFIX_RESOURCE", "WILDCARD_LABEL", "", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "get", "binarySearch", "labels", "", "labelIndex", "", "([B[[BI)Ljava/lang/String;", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int and;
            int and2;
            int length = bArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = (i3 + length) / 2;
                while (i4 > -1 && bArr[i4] != ((byte) 10)) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (bArr[i2] == ((byte) 10)) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        and = 46;
                        z = false;
                    } else {
                        z = z2;
                        and = Util.and(bArr2[i8][i9], 255);
                    }
                    and2 = and - Util.and(bArr[i5 + i10], 255);
                    if (and2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    } else if (bArr2[i8].length != i9) {
                        z2 = z;
                    } else if (i8 == bArr2.length - 1) {
                        break;
                    } else {
                        i8++;
                        i9 = -1;
                        z2 = true;
                    }
                }
                if (and2 >= 0) {
                    if (and2 <= 0) {
                        int i11 = i7 - i10;
                        int length2 = bArr2[i8].length - i9;
                        int length3 = bArr2.length;
                        for (int i12 = i8 + 1; i12 < length3; i12++) {
                            length2 += bArr2[i12].length;
                        }
                        if (length2 >= i11) {
                            if (length2 <= i11) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                C10843j.m431e(UTF_8, "UTF_8");
                                return new String(bArr, i5, i7, UTF_8);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                length = i5 - 1;
            }
            return null;
        }

        @NotNull
        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }
    }

    public static final /* synthetic */ byte[] access$getPublicSuffixListBytes$p(PublicSuffixDatabase publicSuffixDatabase) {
        byte[] bArr = publicSuffixDatabase.publicSuffixListBytes;
        if (bArr != null) {
            return bArr;
        }
        C10843j.m424l("publicSuffixListBytes");
        throw null;
    }

    private final List<String> findMatchingRule(List<String> list) {
        String str;
        String str2;
        String str3;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        if (this.publicSuffixListBytes != null) {
            int size = list.size();
            byte[][] bArr = new byte[size];
            for (int i = 0; i < size; i++) {
                String str4 = list.get(i);
                Charset UTF_8 = StandardCharsets.UTF_8;
                C10843j.m431e(UTF_8, "UTF_8");
                if (str4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = str4.getBytes(UTF_8);
                C10843j.m431e(bytes, "(this as java.lang.String).getBytes(charset)");
                bArr[i] = bytes;
            }
            int i2 = 0;
            while (true) {
                str = null;
                if (i2 >= size) {
                    str2 = null;
                    break;
                }
                Companion companion = Companion;
                byte[] bArr2 = this.publicSuffixListBytes;
                if (bArr2 == null) {
                    C10843j.m424l("publicSuffixListBytes");
                    throw null;
                }
                str2 = companion.binarySearch(bArr2, bArr, i2);
                if (str2 != null) {
                    break;
                }
                i2++;
            }
            if (size > 1) {
                byte[][] bArr3 = (byte[][]) bArr.clone();
                int length = bArr3.length - 1;
                for (int i3 = 0; i3 < length; i3++) {
                    bArr3[i3] = WILDCARD_LABEL;
                    Companion companion2 = Companion;
                    byte[] bArr4 = this.publicSuffixListBytes;
                    if (bArr4 == null) {
                        C10843j.m424l("publicSuffixListBytes");
                        throw null;
                    }
                    str3 = companion2.binarySearch(bArr4, bArr3, i3);
                    if (str3 != null) {
                        break;
                    }
                }
            }
            str3 = null;
            if (str3 != null) {
                int i4 = size - 1;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        break;
                    }
                    Companion companion3 = Companion;
                    byte[] bArr5 = this.publicSuffixExceptionListBytes;
                    if (bArr5 == null) {
                        C10843j.m424l("publicSuffixExceptionListBytes");
                        throw null;
                    }
                    String binarySearch = companion3.binarySearch(bArr5, bArr, i5);
                    if (binarySearch != null) {
                        str = binarySearch;
                        break;
                    }
                    i5++;
                }
            }
            if (str != null) {
                return C10929r.m387E("!".concat(str), new char[]{'.'});
            }
            if (str2 == null && str3 == null) {
                return PREVAILING_RULE;
            }
            List<String> list2 = C10759o.f21363a;
            List<String> m387E = str2 != null ? C10929r.m387E(str2, new char[]{'.'}) : list2;
            if (str3 != null) {
                list2 = C10929r.m387E(str3, new char[]{'.'});
            }
            return m387E.size() > list2.size() ? m387E : list2;
        }
        throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
    }

    private final void readTheList() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream == null) {
            return;
        }
        BufferedSource buffer = Okio.buffer(new GzipSource(Okio.source(resourceAsStream)));
        try {
            byte[] readByteArray = buffer.readByteArray(buffer.readInt());
            byte[] readByteArray2 = buffer.readByteArray(buffer.readInt());
            C10868p c10868p = C10868p.f21418a;
            C10805a.m443a(buffer, null);
            synchronized (this) {
                C10843j.m433c(readByteArray);
                this.publicSuffixListBytes = readByteArray;
                C10843j.m433c(readByteArray2);
                this.publicSuffixExceptionListBytes = readByteArray2;
            }
            this.readCompleteLatch.countDown();
        } finally {
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    Platform.Companion.get().log("Failed to read public suffix list", 5, e);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final List<String> splitDomain(String str) {
        boolean z;
        Object next;
        int i = 0;
        List<String> m387E = C10929r.m387E(str, new char[]{'.'});
        if (!m387E.isEmpty()) {
            if (C10843j.m435a(m387E.get(C10752h.m487b(m387E)), "")) {
                List<String> list = m387E;
                int size = m387E.size() - 1;
                if (size < 0) {
                    size = 0;
                }
                if (size >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (size == 0) {
                        return C10759o.f21363a;
                    }
                    if (list instanceof Collection) {
                        if (size >= list.size()) {
                            return C10757m.m471r(list);
                        }
                        if (size == 1) {
                            if (list instanceof List) {
                                next = C10757m.m479j(list);
                            } else {
                                Iterator<T> it = list.iterator();
                                if (it.hasNext()) {
                                    next = it.next();
                                } else {
                                    throw new NoSuchElementException("Collection is empty.");
                                }
                            }
                            return C10752h.m486c(next);
                        }
                    }
                    ArrayList arrayList = new ArrayList(size);
                    for (Object obj : list) {
                        arrayList.add(obj);
                        i++;
                        if (i == size) {
                            break;
                        }
                    }
                    return C10752h.m484e(arrayList);
                }
                throw new IllegalArgumentException(C0740h.m11849a("Requested element count ", size, " is less than zero.").toString());
            }
            return m387E;
        }
        throw new NoSuchElementException("List is empty.");
    }

    @Nullable
    public final String getEffectiveTldPlusOne(@NotNull String domain) {
        boolean z;
        C10843j.m430f(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        C10843j.m431e(unicodeDomain, "unicodeDomain");
        List<String> splitDomain = splitDomain(unicodeDomain);
        List<String> findMatchingRule = findMatchingRule(splitDomain);
        int i = 0;
        if (splitDomain.size() == findMatchingRule.size() && findMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        char charAt = findMatchingRule.get(0).charAt(0);
        int size = splitDomain.size();
        int size2 = findMatchingRule.size();
        if (charAt != '!') {
            size2++;
        }
        int i2 = size - size2;
        List<String> splitDomain2 = splitDomain(domain);
        C10843j.m430f(splitDomain2, "<this>");
        InterfaceC10902d c10756l = new C10756l(splitDomain2);
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 != 0) {
                if (c10756l instanceof InterfaceC10901c) {
                    c10756l = ((InterfaceC10901c) c10756l).mo409a(i2);
                } else {
                    c10756l = new C10899b(c10756l, i2);
                }
            }
            C10843j.m430f(c10756l, "<this>");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            for (Object obj : c10756l) {
                i++;
                if (i > 1) {
                    sb.append((CharSequence) ".");
                }
                C10919h.m402a(sb, obj, null);
            }
            sb.append((CharSequence) "");
            String sb2 = sb.toString();
            C10843j.m431e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
            return sb2;
        }
        throw new IllegalArgumentException(C0740h.m11849a("Requested element count ", i2, " is less than zero.").toString());
    }

    public final void setListBytes(@NotNull byte[] publicSuffixListBytes, @NotNull byte[] publicSuffixExceptionListBytes) {
        C10843j.m430f(publicSuffixListBytes, "publicSuffixListBytes");
        C10843j.m430f(publicSuffixExceptionListBytes, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = publicSuffixListBytes;
        this.publicSuffixExceptionListBytes = publicSuffixExceptionListBytes;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
