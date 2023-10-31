package okhttp3.internal.http;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.EnumC10735a;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.C10843j;
import kotlin.text.C10925n;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\n\u001a\u00020\t*\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\u0006H\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u001a\u0010\u0016\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000\u001a\n\u0010\u0018\u001a\u00020\u000b*\u00020\u0017\u001a\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0017H\u0007\"\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, m508d2 = {"Lokhttp3/Headers;", "", "headerName", "", "Lokhttp3/Challenge;", "parseChallenges", "Lokio/Buffer;", "", "result", "Lkotlin/p;", "readChallengeHeader", "", "skipCommasAndWhitespace", "", "prefix", "startsWith", "readQuotedString", "readToken", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", ImagesContract.URL, "headers", "receiveHeaders", "Lokhttp3/Response;", "promisesBody", "response", "hasBody", "Lokio/ByteString;", "QUOTED_STRING_DELIMITERS", "Lokio/ByteString;", "TOKEN_DELIMITERS", "okhttp"}, m507k = 2, m506mv = {1, 4, 0})
@JvmName(name = "HttpHeaders")
/* loaded from: classes3.dex */
public final class HttpHeaders {
    private static final ByteString QUOTED_STRING_DELIMITERS;
    private static final ByteString TOKEN_DELIMITERS;

    static {
        ByteString.Companion companion = ByteString.Companion;
        QUOTED_STRING_DELIMITERS = companion.encodeUtf8("\"\\");
        TOKEN_DELIMITERS = companion.encodeUtf8("\t ,=");
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "No longer supported", replaceWith = @ReplaceWith(expression = "response.promisesBody()", imports = {}))
    public static final boolean hasBody(@NotNull Response response) {
        C10843j.m430f(response, "response");
        return promisesBody(response);
    }

    @NotNull
    public static final List<Challenge> parseChallenges(@NotNull Headers parseChallenges, @NotNull String headerName) {
        C10843j.m430f(parseChallenges, "$this$parseChallenges");
        C10843j.m430f(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = parseChallenges.size();
        for (int i = 0; i < size; i++) {
            if (C10925n.m398e(headerName, parseChallenges.name(i))) {
                try {
                    readChallengeHeader(new Buffer().writeUtf8(parseChallenges.value(i)), arrayList);
                } catch (EOFException e) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(@NotNull Response promisesBody) {
        C10843j.m430f(promisesBody, "$this$promisesBody");
        if (C10843j.m435a(promisesBody.request().method(), "HEAD")) {
            return false;
        }
        int code = promisesBody.code();
        return (((code >= 100 && code < 200) || code == 204 || code == 304) && Util.headersContentLength(promisesBody) == -1 && !C10925n.m398e("chunked", Response.header$default(promisesBody, "Transfer-Encoding", null, 2, null))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f6, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f6, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void readChallengeHeader(okio.Buffer r10, java.util.List<okhttp3.Challenge> r11) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.readChallengeHeader(okio.Buffer, java.util.List):void");
    }

    private static final String readQuotedString(Buffer buffer) throws EOFException {
        byte b = (byte) 34;
        if (!(buffer.readByte() == b)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        Buffer buffer2 = new Buffer();
        while (true) {
            long indexOfElement = buffer.indexOfElement(QUOTED_STRING_DELIMITERS);
            if (indexOfElement == -1) {
                return null;
            }
            if (buffer.getByte(indexOfElement) == b) {
                buffer2.write(buffer, indexOfElement);
                buffer.readByte();
                return buffer2.readUtf8();
            } else if (buffer.size() == indexOfElement + 1) {
                return null;
            } else {
                buffer2.write(buffer, indexOfElement);
                buffer.readByte();
                buffer2.write(buffer, 1L);
            }
        }
    }

    private static final String readToken(Buffer buffer) {
        long indexOfElement = buffer.indexOfElement(TOKEN_DELIMITERS);
        if (indexOfElement == -1) {
            indexOfElement = buffer.size();
        }
        if (indexOfElement != 0) {
            return buffer.readUtf8(indexOfElement);
        }
        return null;
    }

    public static final void receiveHeaders(@NotNull CookieJar receiveHeaders, @NotNull HttpUrl url, @NotNull Headers headers) {
        C10843j.m430f(receiveHeaders, "$this$receiveHeaders");
        C10843j.m430f(url, "url");
        C10843j.m430f(headers, "headers");
        if (receiveHeaders == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> parseAll = Cookie.Companion.parseAll(url, headers);
        if (parseAll.isEmpty()) {
            return;
        }
        receiveHeaders.saveFromResponse(url, parseAll);
    }

    private static final boolean skipCommasAndWhitespace(Buffer buffer) {
        boolean z = false;
        while (!buffer.exhausted()) {
            byte b = buffer.getByte(0L);
            if (b == 9 || b == 32) {
                buffer.readByte();
            } else if (b != 44) {
                break;
            } else {
                buffer.readByte();
                z = true;
            }
        }
        return z;
    }

    private static final boolean startsWith(Buffer buffer, byte b) {
        return !buffer.exhausted() && buffer.getByte(0L) == b;
    }
}
