package okhttp3;

import androidx.appcompat.view.menu.C0235r;
import androidx.fragment.app.C1431t;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.EnumC10735a;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.C10753i;
import kotlin.collections.C10759o;
import kotlin.collections.C10761q;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import kotlin.ranges.C10876a;
import kotlin.ranges.C10882g;
import kotlin.text.C10925n;
import kotlin.text.C10929r;
import libv2ray.V2rayConfig;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 J2\u00020\u0001:\u0002IJBa\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b!J\r\u0010\u0011\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\"J\r\u0010\u0012\u001a\u00020\u0003H\u0007¢\u0006\u0002\b#J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\b$J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b%J\r\u0010\u0016\u001a\u00020\u0003H\u0007¢\u0006\u0002\b&J\u0013\u0010'\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u000f\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b)J\b\u0010*\u001a\u00020\bH\u0016J\r\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0002\b+J\u0006\u0010,\u001a\u00020-J\u0010\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020\u0003J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b/J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\b0J\r\u0010\u001a\u001a\u00020\bH\u0007¢\u0006\u0002\b1J\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b2J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b3J\u0010\u00104\u001a\u0004\u0018\u00010\u00032\u0006\u00105\u001a\u00020\u0003J\u000e\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\bJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001eH\u0007¢\u0006\u0002\b8J\u0010\u00109\u001a\u0004\u0018\u00010\u00032\u0006\u00107\u001a\u00020\bJ\u0016\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u00105\u001a\u00020\u0003J\r\u0010 \u001a\u00020\bH\u0007¢\u0006\u0002\b;J\u0006\u0010<\u001a\u00020\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u00002\u0006\u0010.\u001a\u00020\u0003J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b>J\b\u0010?\u001a\u00020\u0003H\u0016J\r\u0010@\u001a\u00020AH\u0007¢\u0006\u0002\bBJ\r\u0010C\u001a\u00020DH\u0007¢\u0006\u0002\b\rJ\b\u0010E\u001a\u0004\u0018\u00010\u0003J\r\u0010B\u001a\u00020AH\u0007¢\u0006\u0002\bFJ\r\u0010\r\u001a\u00020DH\u0007¢\u0006\u0002\bGJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\bHR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\n8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0016\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0015\u0010\f\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0010R\u0013\u0010\u0006\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0019R\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0018\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u0011\u0010 \u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b \u0010\u001bR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010¨\u0006K"}, m508d2 = {"Lokhttp3/HttpUrl;", "", "scheme", "", AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER, "password", "host", "port", "", "pathSegments", "", "queryNamesAndValues", "fragment", ImagesContract.URL, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "encodedFragment", "()Ljava/lang/String;", "encodedPassword", "encodedPath", "encodedPathSegments", "()Ljava/util/List;", "encodedQuery", "encodedUsername", "isHttps", "", "()Z", "pathSize", "()I", "query", "queryParameterNames", "", "()Ljava/util/Set;", "querySize", "-deprecated_encodedFragment", "-deprecated_encodedPassword", "-deprecated_encodedPath", "-deprecated_encodedPathSegments", "-deprecated_encodedQuery", "-deprecated_encodedUsername", "equals", "other", "-deprecated_fragment", "hashCode", "-deprecated_host", "newBuilder", "Lokhttp3/HttpUrl$Builder;", "link", "-deprecated_password", "-deprecated_pathSegments", "-deprecated_pathSize", "-deprecated_port", "-deprecated_query", "queryParameter", "name", "queryParameterName", FirebaseAnalytics.Param.INDEX, "-deprecated_queryParameterNames", "queryParameterValue", "queryParameterValues", "-deprecated_querySize", "redact", "resolve", "-deprecated_scheme", "toString", "toUri", "Ljava/net/URI;", "uri", "toUrl", "Ljava/net/URL;", "topPrivateDomain", "-deprecated_uri", "-deprecated_url", "-deprecated_username", "Builder", "Companion", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class HttpUrl {
    @NotNull
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    @NotNull
    public static final String FRAGMENT_ENCODE_SET = "";
    @NotNull
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    @NotNull
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    @NotNull
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    @NotNull
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    @NotNull
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    @NotNull
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    @NotNull
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    @NotNull
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    @NotNull
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    @Nullable
    private final String fragment;
    @NotNull
    private final String host;
    private final boolean isHttps;
    @NotNull
    private final String password;
    @NotNull
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    @NotNull
    private final String scheme;
    private final String url;
    @NotNull
    private final String username;
    public static final Companion Companion = new Companion(null);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    @Metadata(m509d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010!\n\u0002\b\r\u0018\u0000 \\2\u00020\u0001:\u0001\\B\u0007¢\u0006\u0004\bZ\u0010[J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0002J\u0016\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002J\u0016\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\tJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0002J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002J\u0018\u0010 \u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002J\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0002J\u0010\u0010$\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0002J\u0010\u0010%\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u0002J\u000f\u0010(\u001a\u00020\u0000H\u0000¢\u0006\u0004\b&\u0010'J\u0006\u0010*\u001a\u00020)J\b\u0010+\u001a\u00020\u0002H\u0016J!\u00100\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010)2\u0006\u0010-\u001a\u00020\u0002H\u0000¢\u0006\u0004\b.\u0010/J\b\u00101\u001a\u00020\tH\u0002J\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00022\u0006\u00103\u001a\u000202H\u0002J\u0010\u00106\u001a\u0002052\u0006\u00104\u001a\u00020\u0002H\u0002J \u00109\u001a\u0002052\u0006\u0010-\u001a\u00020\u00022\u0006\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\tH\u0002J0\u0010<\u001a\u0002052\u0006\u0010-\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\t2\u0006\u00108\u001a\u00020\t2\u0006\u0010;\u001a\u0002022\u0006\u00103\u001a\u000202H\u0002J\u0010\u0010=\u001a\u0002022\u0006\u0010-\u001a\u00020\u0002H\u0002J\u0010\u0010>\u001a\u0002022\u0006\u0010-\u001a\u00020\u0002H\u0002J\b\u0010?\u001a\u000205H\u0002R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010\u0005\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010@\u001a\u0004\bE\u0010B\"\u0004\bF\u0010DR\"\u0010\u0007\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010@\u001a\u0004\bG\u0010B\"\u0004\bH\u0010DR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010@\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010DR\"\u0010\n\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020P8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010Q\u001a\u0004\bR\u0010SR,\u0010T\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010P8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u0010Q\u001a\u0004\bU\u0010S\"\u0004\bV\u0010WR$\u0010%\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010@\u001a\u0004\bX\u0010B\"\u0004\bY\u0010D¨\u0006]"}, m508d2 = {"Lokhttp3/HttpUrl$Builder;", "", "", "scheme", AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER, "encodedUsername", "password", "encodedPassword", "host", "", "port", "pathSegment", "addPathSegment", "pathSegments", "addPathSegments", "encodedPathSegment", "addEncodedPathSegment", "encodedPathSegments", "addEncodedPathSegments", FirebaseAnalytics.Param.INDEX, "setPathSegment", "setEncodedPathSegment", "removePathSegment", "encodedPath", "query", "encodedQuery", "name", "value", "addQueryParameter", "encodedName", "encodedValue", "addEncodedQueryParameter", "setQueryParameter", "setEncodedQueryParameter", "removeAllQueryParameters", "removeAllEncodedQueryParameters", "fragment", "encodedFragment", "reencodeForUri$okhttp", "()Lokhttp3/HttpUrl$Builder;", "reencodeForUri", "Lokhttp3/HttpUrl;", "build", "toString", "base", "input", "parse$okhttp", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "parse", "effectivePort", "", "alreadyEncoded", "canonicalName", "Lkotlin/p;", "removeAllCanonicalQueryParameters", "startPos", "limit", "resolvePath", "pos", "addTrailingSlash", "push", "isDot", "isDotDot", "pop", "Ljava/lang/String;", "getScheme$okhttp", "()Ljava/lang/String;", "setScheme$okhttp", "(Ljava/lang/String;)V", "getEncodedUsername$okhttp", "setEncodedUsername$okhttp", "getEncodedPassword$okhttp", "setEncodedPassword$okhttp", "getHost$okhttp", "setHost$okhttp", "I", "getPort$okhttp", "()I", "setPort$okhttp", "(I)V", "", "Ljava/util/List;", "getEncodedPathSegments$okhttp", "()Ljava/util/List;", "encodedQueryNamesAndValues", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "getEncodedFragment$okhttp", "setEncodedFragment$okhttp", "<init>", "()V", "Companion", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        @NotNull
        public static final String INVALID_HOST = "Invalid URL host";
        @Nullable
        private String encodedFragment;
        @NotNull
        private final List<String> encodedPathSegments;
        @Nullable
        private List<String> encodedQueryNamesAndValues;
        @Nullable
        private String host;
        @Nullable
        private String scheme;
        @NotNull
        private String encodedUsername = "";
        @NotNull
        private String encodedPassword = "";
        private int port = -1;

        @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J \u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u001c\u0010\f\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, m508d2 = {"Lokhttp3/HttpUrl$Builder$Companion;", "", "()V", "INVALID_HOST", "", "parsePort", "", "input", "pos", "limit", "portColonOffset", "schemeDelimiterOffset", "slashCount", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(C10839f c10839f) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(String str, int i, int i2) {
                try {
                    int parseInt = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i2, "", false, false, false, false, null, 248, null));
                    if (1 <= parseInt && 65535 >= parseInt) {
                        return parseInt;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(String str, int i, int i2) {
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt == ':') {
                        return i;
                    }
                    if (charAt == '[') {
                        do {
                            i++;
                            if (i < i2) {
                            }
                        } while (str.charAt(i) != ']');
                    }
                    i++;
                }
                return i2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(String str, int i, int i2) {
                if (i2 - i < 2) {
                    return -1;
                }
                char charAt = str.charAt(i);
                if ((C10843j.m428h(charAt, 97) < 0 || C10843j.m428h(charAt, 122) > 0) && (C10843j.m428h(charAt, 65) < 0 || C10843j.m428h(charAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i++;
                    if (i >= i2) {
                        return -1;
                    }
                    char charAt2 = str.charAt(i);
                    if ('a' > charAt2 || 'z' < charAt2) {
                        if ('A' > charAt2 || 'Z' < charAt2) {
                            if ('0' > charAt2 || '9' < charAt2) {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i3++;
                    i++;
                }
                return i3;
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final Builder addPathSegments(String str, boolean z) {
            int i = 0;
            do {
                int delimiterOffset = Util.delimiterOffset(str, "/\\", i, str.length());
                push(str, i, delimiterOffset, delimiterOffset < str.length(), z);
                i = delimiterOffset + 1;
            } while (i <= str.length());
            return this;
        }

        private final int effectivePort() {
            int i = this.port;
            if (i != -1) {
                return i;
            }
            Companion companion = HttpUrl.Companion;
            String str = this.scheme;
            C10843j.m433c(str);
            return companion.defaultPort(str);
        }

        private final boolean isDot(String str) {
            return C10843j.m435a(str, ".") || C10925n.m398e(str, "%2e");
        }

        private final boolean isDotDot(String str) {
            return C10843j.m435a(str, "..") || C10925n.m398e(str, "%2e.") || C10925n.m398e(str, ".%2e") || C10925n.m398e(str, "%2e%2e");
        }

        private final void pop() {
            List<String> list = this.encodedPathSegments;
            if (!(list.remove(list.size() - 1).length() == 0) || !(!this.encodedPathSegments.isEmpty())) {
                this.encodedPathSegments.add("");
                return;
            }
            List<String> list2 = this.encodedPathSegments;
            list2.set(list2.size() - 1, "");
        }

        private final void push(String str, int i, int i2, boolean z, boolean z2) {
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i2, HttpUrl.PATH_SEGMENT_ENCODE_SET, z2, false, false, false, null, 240, null);
            if (isDot(canonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(canonicalize$okhttp$default)) {
                pop();
                return;
            }
            List<String> list = this.encodedPathSegments;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, canonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(canonicalize$okhttp$default);
            }
            if (z) {
                this.encodedPathSegments.add("");
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            C10843j.m433c(list);
            C10876a m412b = C10882g.m412b(new C10876a(list.size() - 2, 0, -1), 2);
            int i = m412b.f21422a;
            int i2 = m412b.f21423b;
            int i3 = m412b.f21424c;
            if (i3 >= 0) {
                if (i > i2) {
                    return;
                }
            } else if (i < i2) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                C10843j.m433c(list2);
                if (C10843j.m435a(str, list2.get(i))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    C10843j.m433c(list3);
                    list3.remove(i + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    C10843j.m433c(list4);
                    list4.remove(i);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    C10843j.m433c(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (i != i2) {
                    i += i3;
                } else {
                    return;
                }
            }
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0041 -> B:11:0x0029). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void resolvePath(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L3
                return
            L3:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L1e
                r1 = 92
                if (r0 != r1) goto L13
                goto L1e
            L13:
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L29
            L1e:
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                r0.add(r2)
                goto L41
            L29:
                r6 = r12
                if (r6 >= r13) goto L44
                java.lang.String r12 = "/\\"
                int r12 = okhttp3.internal.Util.delimiterOffset(r11, r12, r6, r13)
                if (r12 >= r13) goto L36
                r0 = r3
                goto L37
            L36:
                r0 = 0
            L37:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.push(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L29
            L41:
                int r12 = r12 + 1
                goto L29
            L44:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.resolvePath(java.lang.String, int, int):void");
        }

        @NotNull
        public final Builder addEncodedPathSegment(@NotNull String encodedPathSegment) {
            C10843j.m430f(encodedPathSegment, "encodedPathSegment");
            push(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        @NotNull
        public final Builder addEncodedPathSegments(@NotNull String encodedPathSegments) {
            C10843j.m430f(encodedPathSegments, "encodedPathSegments");
            return addPathSegments(encodedPathSegments, true);
        }

        @NotNull
        public final Builder addEncodedQueryParameter(@NotNull String encodedName, @Nullable String str) {
            C10843j.m430f(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            C10843j.m433c(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            C10843j.m433c(list2);
            list2.add(str != null ? Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null) : null);
            return this;
        }

        @NotNull
        public final Builder addPathSegment(@NotNull String pathSegment) {
            C10843j.m430f(pathSegment, "pathSegment");
            push(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        @NotNull
        public final Builder addPathSegments(@NotNull String pathSegments) {
            C10843j.m430f(pathSegments, "pathSegments");
            return addPathSegments(pathSegments, false);
        }

        @NotNull
        public final Builder addQueryParameter(@NotNull String name, @Nullable String str) {
            C10843j.m430f(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            C10843j.m433c(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            C10843j.m433c(list2);
            list2.add(str != null ? Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null) : null);
            return this;
        }

        @NotNull
        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String percentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
                String percentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
                String str2 = this.host;
                if (str2 != null) {
                    int effectivePort = effectivePort();
                    List<String> list = this.encodedPathSegments;
                    ArrayList arrayList2 = new ArrayList(C10753i.m482g(list));
                    for (String str3 : list) {
                        arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str3, 0, 0, false, 7, null));
                    }
                    List<String> list2 = this.encodedQueryNamesAndValues;
                    if (list2 != null) {
                        List<String> list3 = list2;
                        arrayList = new ArrayList(C10753i.m482g(list3));
                        for (String str4 : list3) {
                            arrayList.add(str4 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str4, 0, 0, true, 3, null) : null);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str5 = this.encodedFragment;
                    return new HttpUrl(str, percentDecode$okhttp$default, percentDecode$okhttp$default2, str2, effectivePort, arrayList2, arrayList, str5 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str5, 0, 0, false, 7, null) : null, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        @NotNull
        public final Builder encodedFragment(@Nullable String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", true, false, false, true, null, 179, null) : null;
            return this;
        }

        @NotNull
        public final Builder encodedPassword(@NotNull String encodedPassword) {
            C10843j.m430f(encodedPassword, "encodedPassword");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        @NotNull
        public final Builder encodedPath(@NotNull String encodedPath) {
            C10843j.m430f(encodedPath, "encodedPath");
            if (C10925n.m392k(encodedPath, RemoteSettings.FORWARD_SLASH_STRING, false)) {
                resolvePath(encodedPath, 0, encodedPath.length());
                return this;
            }
            throw new IllegalArgumentException("unexpected encodedPath: ".concat(encodedPath).toString());
        }

        @NotNull
        public final Builder encodedQuery(@Nullable String str) {
            List<String> list;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 211, null);
                if (canonicalize$okhttp$default != null) {
                    list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
                    this.encodedQueryNamesAndValues = list;
                    return this;
                }
            }
            list = null;
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        @NotNull
        public final Builder encodedUsername(@NotNull String encodedUsername) {
            C10843j.m430f(encodedUsername, "encodedUsername");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        @NotNull
        public final Builder fragment(@Nullable String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        @Nullable
        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        @NotNull
        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        @NotNull
        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        @Nullable
        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        @NotNull
        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        @Nullable
        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        @Nullable
        public final String getScheme$okhttp() {
            return this.scheme;
        }

        @NotNull
        public final Builder host(@NotNull String host) {
            C10843j.m430f(host, "host");
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, host, 0, 0, false, 7, null));
            if (canonicalHost != null) {
                this.host = canonicalHost;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: ".concat(host));
        }

        @NotNull
        public final Builder parse$okhttp(@Nullable HttpUrl httpUrl, @NotNull String input) {
            int delimiterOffset;
            char c;
            int i;
            boolean z;
            boolean z2;
            int i2;
            boolean z3;
            int i3;
            boolean z4;
            boolean z5;
            C10843j.m430f(input, "input");
            int indexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(input, 0, 0, 3, null);
            int indexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(input, indexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = Companion;
            int schemeDelimiterOffset = companion.schemeDelimiterOffset(input, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            boolean z6 = true;
            char c2 = 65535;
            if (schemeDelimiterOffset != -1) {
                if (C10925n.m393j(input, "https:", indexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "https";
                    indexOfFirstNonAsciiWhitespace$default += 6;
                } else if (C10925n.m393j(input, "http:", indexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = V2rayConfig.HTTP;
                    indexOfFirstNonAsciiWhitespace$default += 5;
                } else {
                    StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                    String substring = input.substring(0, schemeDelimiterOffset);
                    C10843j.m431e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    sb.append(substring);
                    sb.append("'");
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (httpUrl != null) {
                this.scheme = httpUrl.scheme();
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int slashCount = companion.slashCount(input, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            char c3 = '?';
            char c4 = '#';
            if (slashCount < 2 && httpUrl != null && !(!C10843j.m435a(httpUrl.scheme(), this.scheme))) {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (indexOfFirstNonAsciiWhitespace$default == indexOfLastNonAsciiWhitespace$default || input.charAt(indexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
                i = indexOfLastNonAsciiWhitespace$default;
            } else {
                boolean z7 = false;
                boolean z8 = false;
                int i4 = indexOfFirstNonAsciiWhitespace$default + slashCount;
                while (true) {
                    delimiterOffset = Util.delimiterOffset(input, "@/\\?#", i4, indexOfLastNonAsciiWhitespace$default);
                    if (delimiterOffset != indexOfLastNonAsciiWhitespace$default) {
                        c = input.charAt(delimiterOffset);
                    } else {
                        c = c2;
                    }
                    if (c == c2 || c == c4 || c == '/' || c == '\\' || c == c3) {
                        break;
                    }
                    if (c != '@') {
                        z3 = z6;
                        i3 = indexOfLastNonAsciiWhitespace$default;
                    } else {
                        if (!z7) {
                            int delimiterOffset2 = Util.delimiterOffset(input, ':', i4, delimiterOffset);
                            Companion companion2 = HttpUrl.Companion;
                            z3 = z6;
                            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, input, i4, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z8) {
                                canonicalize$okhttp$default = C1431t.m10577a(new StringBuilder(), this.encodedUsername, "%40", canonicalize$okhttp$default);
                            }
                            this.encodedUsername = canonicalize$okhttp$default;
                            if (delimiterOffset2 != delimiterOffset) {
                                i2 = delimiterOffset;
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, input, delimiterOffset2 + 1, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z5 = z3;
                            } else {
                                i2 = delimiterOffset;
                                z5 = z7;
                            }
                            z7 = z5;
                            i3 = indexOfLastNonAsciiWhitespace$default;
                            z4 = z3;
                        } else {
                            i2 = delimiterOffset;
                            z3 = z6;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.encodedPassword);
                            sb2.append("%40");
                            i3 = indexOfLastNonAsciiWhitespace$default;
                            sb2.append(Companion.canonicalize$okhttp$default(HttpUrl.Companion, input, i4, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb2.toString();
                            z4 = z8;
                        }
                        i4 = i2 + 1;
                        z8 = z4;
                    }
                    c4 = '#';
                    c3 = '?';
                    c2 = 65535;
                    indexOfLastNonAsciiWhitespace$default = i3;
                    z6 = z3;
                }
                boolean z9 = z6;
                i = indexOfLastNonAsciiWhitespace$default;
                Companion companion3 = Companion;
                int portColonOffset = companion3.portColonOffset(input, i4, delimiterOffset);
                int i5 = portColonOffset + 1;
                if (i5 < delimiterOffset) {
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, input, i4, portColonOffset, false, 4, null));
                    int parsePort = companion3.parsePort(input, i5, delimiterOffset);
                    this.port = parsePort;
                    if (parsePort != -1) {
                        z2 = z9;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        StringBuilder sb3 = new StringBuilder("Invalid URL port: \"");
                        String substring2 = input.substring(i5, delimiterOffset);
                        C10843j.m431e(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb3.append(substring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    Companion companion4 = HttpUrl.Companion;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, input, i4, portColonOffset, false, 4, null));
                    String str = this.scheme;
                    C10843j.m433c(str);
                    this.port = companion4.defaultPort(str);
                }
                if (this.host != null) {
                    z = z9;
                } else {
                    z = false;
                }
                if (z) {
                    indexOfFirstNonAsciiWhitespace$default = delimiterOffset;
                } else {
                    StringBuilder sb4 = new StringBuilder("Invalid URL host: \"");
                    String substring3 = input.substring(i4, portColonOffset);
                    C10843j.m431e(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    sb4.append(substring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
            }
            int i6 = i;
            int delimiterOffset3 = Util.delimiterOffset(input, "?#", indexOfFirstNonAsciiWhitespace$default, i6);
            resolvePath(input, indexOfFirstNonAsciiWhitespace$default, delimiterOffset3);
            if (delimiterOffset3 < i6 && input.charAt(delimiterOffset3) == '?') {
                int delimiterOffset4 = Util.delimiterOffset(input, '#', delimiterOffset3, i6);
                Companion companion5 = HttpUrl.Companion;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, input, delimiterOffset3 + 1, delimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                delimiterOffset3 = delimiterOffset4;
            }
            if (delimiterOffset3 < i6 && input.charAt(delimiterOffset3) == '#') {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, input, delimiterOffset3 + 1, i6, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        @NotNull
        public final Builder password(@NotNull String password) {
            C10843j.m430f(password, "password");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        @NotNull
        public final Builder port(int i) {
            boolean z = true;
            if ((1 > i || 65535 < i) ? false : false) {
                this.port = i;
                return this;
            }
            throw new IllegalArgumentException(C0235r.m12816a("unexpected port: ", i).toString());
        }

        @NotNull
        public final Builder query(@Nullable String str) {
            List<String> list;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_ENCODE_SET, false, false, true, false, null, 219, null);
                if (canonicalize$okhttp$default != null) {
                    list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
                    this.encodedQueryNamesAndValues = list;
                    return this;
                }
            }
            list = null;
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        @NotNull
        public final Builder reencodeForUri$okhttp() {
            String str;
            String str2;
            String str3 = this.host;
            String str4 = null;
            if (str3 != null) {
                Pattern compile = Pattern.compile("[\"<>^`{|}]");
                C10843j.m431e(compile, "compile(pattern)");
                str = compile.matcher(str3).replaceAll("");
                C10843j.m431e(str, "nativePattern.matcher(in…).replaceAll(replacement)");
            } else {
                str = null;
            }
            this.host = str;
            int size = this.encodedPathSegments.size();
            for (int i = 0; i < size; i++) {
                List<String> list = this.encodedPathSegments;
                list.set(i, Companion.canonicalize$okhttp$default(HttpUrl.Companion, list.get(i), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str5 = list2.get(i2);
                    if (str5 != null) {
                        str2 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str5, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null);
                    } else {
                        str2 = null;
                    }
                    list2.set(i2, str2);
                }
            }
            String str6 = this.encodedFragment;
            if (str6 != null) {
                str4 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str6, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null);
            }
            this.encodedFragment = str4;
            return this;
        }

        @NotNull
        public final Builder removeAllEncodedQueryParameters(@NotNull String encodedName) {
            C10843j.m430f(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        @NotNull
        public final Builder removeAllQueryParameters(@NotNull String name) {
            C10843j.m430f(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        @NotNull
        public final Builder removePathSegment(int i) {
            this.encodedPathSegments.remove(i);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        @NotNull
        public final Builder scheme(@NotNull String scheme) {
            C10843j.m430f(scheme, "scheme");
            String str = V2rayConfig.HTTP;
            if (!C10925n.m398e(scheme, V2rayConfig.HTTP)) {
                str = "https";
                if (!C10925n.m398e(scheme, "https")) {
                    throw new IllegalArgumentException("unexpected scheme: ".concat(scheme));
                }
            }
            this.scheme = str;
            return this;
        }

        public final void setEncodedFragment$okhttp(@Nullable String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(@NotNull String str) {
            C10843j.m430f(str, "<set-?>");
            this.encodedPassword = str;
        }

        @NotNull
        public final Builder setEncodedPathSegment(int i, @NotNull String encodedPathSegment) {
            C10843j.m430f(encodedPathSegment, "encodedPathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedPathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(i, canonicalize$okhttp$default);
            if ((isDot(canonicalize$okhttp$default) || isDotDot(canonicalize$okhttp$default)) ? false : true) {
                return this;
            }
            throw new IllegalArgumentException("unexpected path segment: ".concat(encodedPathSegment).toString());
        }

        public final void setEncodedQueryNamesAndValues$okhttp(@Nullable List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        @NotNull
        public final Builder setEncodedQueryParameter(@NotNull String encodedName, @Nullable String str) {
            C10843j.m430f(encodedName, "encodedName");
            removeAllEncodedQueryParameters(encodedName);
            addEncodedQueryParameter(encodedName, str);
            return this;
        }

        public final void setEncodedUsername$okhttp(@NotNull String str) {
            C10843j.m430f(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(@Nullable String str) {
            this.host = str;
        }

        @NotNull
        public final Builder setPathSegment(int i, @NotNull String pathSegment) {
            C10843j.m430f(pathSegment, "pathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, pathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if ((isDot(canonicalize$okhttp$default) || isDotDot(canonicalize$okhttp$default)) ? false : true) {
                this.encodedPathSegments.set(i, canonicalize$okhttp$default);
                return this;
            }
            throw new IllegalArgumentException("unexpected path segment: ".concat(pathSegment).toString());
        }

        public final void setPort$okhttp(int i) {
            this.port = i;
        }

        @NotNull
        public final Builder setQueryParameter(@NotNull String name, @Nullable String str) {
            C10843j.m430f(name, "name");
            removeAllQueryParameters(name);
            addQueryParameter(name, str);
            return this;
        }

        public final void setScheme$okhttp(@Nullable String str) {
            this.scheme = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
            if ((r5.encodedPassword.length() > 0) != false) goto L38;
         */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r5.scheme
                if (r1 == 0) goto Lf
                r0.append(r1)
                java.lang.String r1 = "://"
                goto L11
            Lf:
                java.lang.String r1 = "//"
            L11:
                r0.append(r1)
                java.lang.String r1 = r5.encodedUsername
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L20
                r1 = r2
                goto L21
            L20:
                r1 = r3
            L21:
                r4 = 58
                if (r1 != 0) goto L32
                java.lang.String r1 = r5.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L2f
                r1 = r2
                goto L30
            L2f:
                r1 = r3
            L30:
                if (r1 == 0) goto L50
            L32:
                java.lang.String r1 = r5.encodedUsername
                r0.append(r1)
                java.lang.String r1 = r5.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L40
                goto L41
            L40:
                r2 = r3
            L41:
                if (r2 == 0) goto L4b
                r0.append(r4)
                java.lang.String r1 = r5.encodedPassword
                r0.append(r1)
            L4b:
                r1 = 64
                r0.append(r1)
            L50:
                java.lang.String r1 = r5.host
                if (r1 == 0) goto L6f
                boolean r1 = kotlin.text.C10929r.m380l(r1, r4)
                if (r1 == 0) goto L6a
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r5.host
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L6f
            L6a:
                java.lang.String r1 = r5.host
                r0.append(r1)
            L6f:
                int r1 = r5.port
                r2 = -1
                if (r1 != r2) goto L78
                java.lang.String r1 = r5.scheme
                if (r1 == 0) goto L8e
            L78:
                int r1 = r5.effectivePort()
                java.lang.String r2 = r5.scheme
                if (r2 == 0) goto L88
                okhttp3.HttpUrl$Companion r3 = okhttp3.HttpUrl.Companion
                int r2 = r3.defaultPort(r2)
                if (r1 == r2) goto L8e
            L88:
                r0.append(r4)
                r0.append(r1)
            L8e:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.util.List<java.lang.String> r2 = r5.encodedPathSegments
                r1.toPathString$okhttp(r2, r0)
                java.util.List<java.lang.String> r2 = r5.encodedQueryNamesAndValues
                if (r2 == 0) goto La6
                r2 = 63
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r5.encodedQueryNamesAndValues
                kotlin.jvm.internal.C10843j.m433c(r2)
                r1.toQueryString$okhttp(r2, r0)
            La6:
                java.lang.String r1 = r5.encodedFragment
                if (r1 == 0) goto Lb4
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r5.encodedFragment
                r0.append(r1)
            Lb4:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.C10843j.m431e(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        @NotNull
        public final Builder username(@NotNull String username) {
            C10843j.m430f(username, "username");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    @Metadata(m509d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0019\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bG\u0010HJ,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\f\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002JV\u0010\u0014\u001a\u00020\n*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0003H\u0007J%\u0010\u001d\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00030\u00172\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00172\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ\u001b\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030 *\u00020\u0003H\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010'\u001a\u00020$*\u00020\u0003H\u0007¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u0004\u0018\u00010$*\u00020\u0003H\u0007¢\u0006\u0004\b(\u0010&J\u0015\u0010)\u001a\u0004\u0018\u00010$*\u00020*H\u0007¢\u0006\u0004\b%\u0010+J\u0015\u0010)\u001a\u0004\u0018\u00010$*\u00020,H\u0007¢\u0006\u0004\b%\u0010-J\u0017\u0010%\u001a\u00020$2\u0006\u0010.\u001a\u00020\u0003H\u0007¢\u0006\u0004\b/\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010$2\u0006\u0010.\u001a\u00020\u0003H\u0007¢\u0006\u0004\b0\u0010&J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010.\u001a\u00020*H\u0007¢\u0006\u0004\b/\u0010+J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u00101\u001a\u00020,H\u0007¢\u0006\u0004\b/\u0010-J1\u00104\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b2\u00103Jc\u00107\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b5\u00106R\u0014\u00108\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b:\u00109R\u0014\u0010;\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b;\u00109R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b?\u00109R\u0014\u0010@\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b@\u00109R\u0014\u0010A\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\bA\u00109R\u0014\u0010B\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\bB\u00109R\u0014\u0010C\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\bC\u00109R\u0014\u0010D\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\bD\u00109R\u0014\u0010E\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\bE\u00109R\u0014\u0010F\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\bF\u00109¨\u0006I"}, m508d2 = {"Lokhttp3/HttpUrl$Companion;", "", "Lokio/Buffer;", "", "encoded", "", "pos", "limit", "", "plusIsSpace", "Lkotlin/p;", "writePercentDecoded", "isPercentEncoded", "input", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "writeCanonicalized", "scheme", "defaultPort", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "toPathString$okhttp", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "toPathString", "toQueryString$okhttp", "toQueryString", "", "toQueryNamesAndValues$okhttp", "(Ljava/lang/String;)Ljava/util/List;", "toQueryNamesAndValues", "Lokhttp3/HttpUrl;", "get", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "toHttpUrl", "parse", "toHttpUrlOrNull", "Ljava/net/URL;", "(Ljava/net/URL;)Lokhttp3/HttpUrl;", "Ljava/net/URI;", "(Ljava/net/URI;)Lokhttp3/HttpUrl;", ImagesContract.URL, "-deprecated_get", "-deprecated_parse", "uri", "percentDecode$okhttp", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "percentDecode", "canonicalize$okhttp", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "canonicalize", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "<init>", "()V", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            return companion.canonicalize$okhttp(str, (i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? str.length() : i2, str2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? false : z4, (i3 & 128) != 0 ? null : charset);
        }

        private final boolean isPercentEncoded(String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && Util.parseHexDigit(str.charAt(i + 1)) != -1 && Util.parseHexDigit(str.charAt(i3)) != -1;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return companion.percentDecode$okhttp(str, i, i2, z);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x005d, code lost:
            if (isPercentEncoded(r15, r4, r17) == false) goto L40;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void writeCanonicalized(okio.Buffer r14, java.lang.String r15, int r16, int r17, java.lang.String r18, boolean r19, boolean r20, boolean r21, boolean r22, java.nio.charset.Charset r23) {
            /*
                r13 = this;
                r0 = r14
                r1 = r15
                r2 = r17
                r3 = r23
                r4 = 0
                r5 = r4
                r4 = r16
            La:
                if (r4 >= r2) goto Lc0
                if (r1 == 0) goto Lb7
                int r6 = r15.codePointAt(r4)
                if (r19 == 0) goto L24
                r7 = 9
                if (r6 == r7) goto L34
                r7 = 10
                if (r6 == r7) goto L34
                r7 = 12
                if (r6 == r7) goto L34
                r7 = 13
                if (r6 == r7) goto L34
            L24:
                r7 = 43
                if (r6 != r7) goto L39
                if (r21 == 0) goto L39
                if (r19 == 0) goto L2f
                java.lang.String r7 = "+"
                goto L31
            L2f:
                java.lang.String r7 = "%2B"
            L31:
                r14.writeUtf8(r7)
            L34:
                r7 = r13
                r9 = r18
                goto Lb0
            L39:
                r7 = 32
                r8 = 37
                if (r6 < r7) goto L67
                r7 = 127(0x7f, float:1.78E-43)
                if (r6 == r7) goto L67
                r7 = 128(0x80, float:1.8E-43)
                if (r6 < r7) goto L49
                if (r22 == 0) goto L67
            L49:
                char r7 = (char) r6
                r9 = r18
                boolean r7 = kotlin.text.C10929r.m380l(r9, r7)
                if (r7 != 0) goto L65
                if (r6 != r8) goto L60
                if (r19 == 0) goto L65
                if (r20 == 0) goto L60
                r7 = r13
                boolean r10 = r13.isPercentEncoded(r15, r4, r2)
                if (r10 != 0) goto L61
                goto L6a
            L60:
                r7 = r13
            L61:
                r14.writeUtf8CodePoint(r6)
                goto Lb0
            L65:
                r7 = r13
                goto L6a
            L67:
                r7 = r13
                r9 = r18
            L6a:
                if (r5 != 0) goto L71
                okio.Buffer r5 = new okio.Buffer
                r5.<init>()
            L71:
                if (r3 == 0) goto L85
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = kotlin.jvm.internal.C10843j.m435a(r3, r10)
                if (r10 == 0) goto L7c
                goto L85
            L7c:
                int r10 = java.lang.Character.charCount(r6)
                int r10 = r10 + r4
                r5.writeString(r15, r4, r10, r3)
                goto L88
            L85:
                r5.writeUtf8CodePoint(r6)
            L88:
                boolean r10 = r5.exhausted()
                if (r10 != 0) goto Lb0
                byte r10 = r5.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r14.writeByte(r8)
                char[] r11 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                int r12 = r10 >> 4
                r12 = r12 & 15
                char r11 = r11[r12]
                r14.writeByte(r11)
                char[] r11 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                r10 = r10 & 15
                char r10 = r11[r10]
                r14.writeByte(r10)
                goto L88
            Lb0:
                int r6 = java.lang.Character.charCount(r6)
                int r4 = r4 + r6
                goto La
            Lb7:
                r7 = r13
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)
                throw r0
            Lc0:
                r7 = r13
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.writeCanonicalized(okio.Buffer, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void writePercentDecoded(Buffer buffer, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                int codePointAt = str.codePointAt(i);
                if (codePointAt != 37 || (i3 = i + 2) >= i2) {
                    if (codePointAt == 43 && z) {
                        buffer.writeByte(32);
                        i++;
                    }
                    buffer.writeUtf8CodePoint(codePointAt);
                    i += Character.charCount(codePointAt);
                } else {
                    int parseHexDigit = Util.parseHexDigit(str.charAt(i + 1));
                    int parseHexDigit2 = Util.parseHexDigit(str.charAt(i3));
                    if (parseHexDigit != -1 && parseHexDigit2 != -1) {
                        buffer.writeByte((parseHexDigit << 4) + parseHexDigit2);
                        i = Character.charCount(codePointAt) + i3;
                    }
                    buffer.writeUtf8CodePoint(codePointAt);
                    i += Character.charCount(codePointAt);
                }
            }
        }

        @Deprecated(level = EnumC10735a.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        @JvmName(name = "-deprecated_get")
        @NotNull
        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m13163deprecated_get(@NotNull String url) {
            C10843j.m430f(url, "url");
            return get(url);
        }

        @Deprecated(level = EnumC10735a.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @JvmName(name = "-deprecated_get")
        @Nullable
        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m13164deprecated_get(@NotNull URI uri) {
            C10843j.m430f(uri, "uri");
            return get(uri);
        }

        @Deprecated(level = EnumC10735a.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @JvmName(name = "-deprecated_get")
        @Nullable
        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m13165deprecated_get(@NotNull URL url) {
            C10843j.m430f(url, "url");
            return get(url);
        }

        @Deprecated(level = EnumC10735a.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @JvmName(name = "-deprecated_parse")
        @Nullable
        /* renamed from: -deprecated_parse  reason: not valid java name */
        public final HttpUrl m13166deprecated_parse(@NotNull String url) {
            C10843j.m430f(url, "url");
            return parse(url);
        }

        @NotNull
        public final String canonicalize$okhttp(@NotNull String canonicalize, int i, int i2, @NotNull String encodeSet, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Charset charset) {
            C10843j.m430f(canonicalize, "$this$canonicalize");
            C10843j.m430f(encodeSet, "encodeSet");
            int i3 = i;
            while (i3 < i2) {
                int codePointAt = canonicalize.codePointAt(i3);
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z4) && !C10929r.m380l(encodeSet, (char) codePointAt))) {
                    if (codePointAt == 37) {
                        if (z) {
                            if (z2) {
                                if (!isPercentEncoded(canonicalize, i3, i2)) {
                                    Buffer buffer = new Buffer();
                                    buffer.writeUtf8(canonicalize, i, i3);
                                    writeCanonicalized(buffer, canonicalize, i3, i2, encodeSet, z, z2, z3, z4, charset);
                                    return buffer.readUtf8();
                                }
                                if (codePointAt != 43 && z3) {
                                    Buffer buffer2 = new Buffer();
                                    buffer2.writeUtf8(canonicalize, i, i3);
                                    writeCanonicalized(buffer2, canonicalize, i3, i2, encodeSet, z, z2, z3, z4, charset);
                                    return buffer2.readUtf8();
                                }
                                i3 += Character.charCount(codePointAt);
                            }
                        }
                    }
                    if (codePointAt != 43) {
                    }
                    i3 += Character.charCount(codePointAt);
                }
                Buffer buffer22 = new Buffer();
                buffer22.writeUtf8(canonicalize, i, i3);
                writeCanonicalized(buffer22, canonicalize, i3, i2, encodeSet, z, z2, z3, z4, charset);
                return buffer22.readUtf8();
            }
            String substring = canonicalize.substring(i, i2);
            C10843j.m431e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        @JvmStatic
        public final int defaultPort(@NotNull String scheme) {
            C10843j.m430f(scheme, "scheme");
            int hashCode = scheme.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && scheme.equals("https")) {
                    return V2rayConfig.DEFAULT_PORT;
                }
            } else if (scheme.equals(V2rayConfig.HTTP)) {
                return 80;
            }
            return -1;
        }

        @JvmStatic
        @JvmName(name = "get")
        @NotNull
        public final HttpUrl get(@NotNull String toHttpUrl) {
            C10843j.m430f(toHttpUrl, "$this$toHttpUrl");
            return new Builder().parse$okhttp(null, toHttpUrl).build();
        }

        @JvmStatic
        @JvmName(name = "get")
        @Nullable
        public final HttpUrl get(@NotNull URI toHttpUrlOrNull) {
            C10843j.m430f(toHttpUrlOrNull, "$this$toHttpUrlOrNull");
            String uri = toHttpUrlOrNull.toString();
            C10843j.m431e(uri, "toString()");
            return parse(uri);
        }

        @JvmStatic
        @JvmName(name = "get")
        @Nullable
        public final HttpUrl get(@NotNull URL toHttpUrlOrNull) {
            C10843j.m430f(toHttpUrlOrNull, "$this$toHttpUrlOrNull");
            String url = toHttpUrlOrNull.toString();
            C10843j.m431e(url, "toString()");
            return parse(url);
        }

        @JvmStatic
        @JvmName(name = "parse")
        @Nullable
        public final HttpUrl parse(@NotNull String toHttpUrlOrNull) {
            C10843j.m430f(toHttpUrlOrNull, "$this$toHttpUrlOrNull");
            try {
                return get(toHttpUrlOrNull);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @NotNull
        public final String percentDecode$okhttp(@NotNull String percentDecode, int i, int i2, boolean z) {
            C10843j.m430f(percentDecode, "$this$percentDecode");
            for (int i3 = i; i3 < i2; i3++) {
                char charAt = percentDecode.charAt(i3);
                if (charAt == '%' || (charAt == '+' && z)) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(percentDecode, i, i3);
                    writePercentDecoded(buffer, percentDecode, i3, i2, z);
                    return buffer.readUtf8();
                }
            }
            String substring = percentDecode.substring(i, i2);
            C10843j.m431e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final void toPathString$okhttp(@NotNull List<String> toPathString, @NotNull StringBuilder out) {
            C10843j.m430f(toPathString, "$this$toPathString");
            C10843j.m430f(out, "out");
            int size = toPathString.size();
            for (int i = 0; i < size; i++) {
                out.append('/');
                out.append(toPathString.get(i));
            }
        }

        @NotNull
        public final List<String> toQueryNamesAndValues$okhttp(@NotNull String toQueryNamesAndValues) {
            String str;
            C10843j.m430f(toQueryNamesAndValues, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= toQueryNamesAndValues.length()) {
                int m374r = C10929r.m374r(toQueryNamesAndValues, '&', i, false, 4);
                if (m374r == -1) {
                    m374r = toQueryNamesAndValues.length();
                }
                int m374r2 = C10929r.m374r(toQueryNamesAndValues, '=', i, false, 4);
                if (m374r2 == -1 || m374r2 > m374r) {
                    String substring = toQueryNamesAndValues.substring(i, m374r);
                    C10843j.m431e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    str = null;
                } else {
                    String substring2 = toQueryNamesAndValues.substring(i, m374r2);
                    C10843j.m431e(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    str = toQueryNamesAndValues.substring(m374r2 + 1, m374r);
                    C10843j.m431e(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                arrayList.add(str);
                i = m374r + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(@NotNull List<String> toQueryString, @NotNull StringBuilder out) {
            C10843j.m430f(toQueryString, "$this$toQueryString");
            C10843j.m430f(out, "out");
            C10876a m412b = C10882g.m412b(C10882g.m411c(0, toQueryString.size()), 2);
            int i = m412b.f21422a;
            int i2 = m412b.f21423b;
            int i3 = m412b.f21424c;
            if (i3 >= 0) {
                if (i > i2) {
                    return;
                }
            } else if (i < i2) {
                return;
            }
            while (true) {
                String str = toQueryString.get(i);
                String str2 = toQueryString.get(i + 1);
                if (i > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (i == i2) {
                    return;
                }
                i += i3;
            }
        }
    }

    public HttpUrl(@NotNull String scheme, @NotNull String username, @NotNull String password, @NotNull String host, int i, @NotNull List<String> pathSegments, @Nullable List<String> list, @Nullable String str, @NotNull String url) {
        C10843j.m430f(scheme, "scheme");
        C10843j.m430f(username, "username");
        C10843j.m430f(password, "password");
        C10843j.m430f(host, "host");
        C10843j.m430f(pathSegments, "pathSegments");
        C10843j.m430f(url, "url");
        this.scheme = scheme;
        this.username = username;
        this.password = password;
        this.host = host;
        this.port = i;
        this.pathSegments = pathSegments;
        this.queryNamesAndValues = list;
        this.fragment = str;
        this.url = url;
        this.isHttps = C10843j.m435a(scheme, "https");
    }

    @JvmStatic
    public static final int defaultPort(@NotNull String str) {
        return Companion.defaultPort(str);
    }

    @JvmStatic
    @JvmName(name = "get")
    @NotNull
    public static final HttpUrl get(@NotNull String str) {
        return Companion.get(str);
    }

    @JvmStatic
    @JvmName(name = "get")
    @Nullable
    public static final HttpUrl get(@NotNull URI uri) {
        return Companion.get(uri);
    }

    @JvmStatic
    @JvmName(name = "get")
    @Nullable
    public static final HttpUrl get(@NotNull URL url) {
        return Companion.get(url);
    }

    @JvmStatic
    @JvmName(name = "parse")
    @Nullable
    public static final HttpUrl parse(@NotNull String str) {
        return Companion.parse(str);
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedFragment", imports = {}))
    @JvmName(name = "-deprecated_encodedFragment")
    @Nullable
    /* renamed from: -deprecated_encodedFragment  reason: not valid java name */
    public final String m13144deprecated_encodedFragment() {
        return encodedFragment();
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedPassword", imports = {}))
    @JvmName(name = "-deprecated_encodedPassword")
    @NotNull
    /* renamed from: -deprecated_encodedPassword  reason: not valid java name */
    public final String m13145deprecated_encodedPassword() {
        return encodedPassword();
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedPath", imports = {}))
    @JvmName(name = "-deprecated_encodedPath")
    @NotNull
    /* renamed from: -deprecated_encodedPath  reason: not valid java name */
    public final String m13146deprecated_encodedPath() {
        return encodedPath();
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedPathSegments", imports = {}))
    @JvmName(name = "-deprecated_encodedPathSegments")
    @NotNull
    /* renamed from: -deprecated_encodedPathSegments  reason: not valid java name */
    public final List<String> m13147deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedQuery", imports = {}))
    @JvmName(name = "-deprecated_encodedQuery")
    @Nullable
    /* renamed from: -deprecated_encodedQuery  reason: not valid java name */
    public final String m13148deprecated_encodedQuery() {
        return encodedQuery();
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedUsername", imports = {}))
    @JvmName(name = "-deprecated_encodedUsername")
    @NotNull
    /* renamed from: -deprecated_encodedUsername  reason: not valid java name */
    public final String m13149deprecated_encodedUsername() {
        return encodedUsername();
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "fragment", imports = {}))
    @JvmName(name = "-deprecated_fragment")
    @Nullable
    /* renamed from: -deprecated_fragment  reason: not valid java name */
    public final String m13150deprecated_fragment() {
        return this.fragment;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "host", imports = {}))
    @JvmName(name = "-deprecated_host")
    @NotNull
    /* renamed from: -deprecated_host  reason: not valid java name */
    public final String m13151deprecated_host() {
        return this.host;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "password", imports = {}))
    @JvmName(name = "-deprecated_password")
    @NotNull
    /* renamed from: -deprecated_password  reason: not valid java name */
    public final String m13152deprecated_password() {
        return this.password;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "pathSegments", imports = {}))
    @JvmName(name = "-deprecated_pathSegments")
    @NotNull
    /* renamed from: -deprecated_pathSegments  reason: not valid java name */
    public final List<String> m13153deprecated_pathSegments() {
        return this.pathSegments;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "pathSize", imports = {}))
    @JvmName(name = "-deprecated_pathSize")
    /* renamed from: -deprecated_pathSize  reason: not valid java name */
    public final int m13154deprecated_pathSize() {
        return pathSize();
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "port", imports = {}))
    @JvmName(name = "-deprecated_port")
    /* renamed from: -deprecated_port  reason: not valid java name */
    public final int m13155deprecated_port() {
        return this.port;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "query", imports = {}))
    @JvmName(name = "-deprecated_query")
    @Nullable
    /* renamed from: -deprecated_query  reason: not valid java name */
    public final String m13156deprecated_query() {
        return query();
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "queryParameterNames", imports = {}))
    @JvmName(name = "-deprecated_queryParameterNames")
    @NotNull
    /* renamed from: -deprecated_queryParameterNames  reason: not valid java name */
    public final Set<String> m13157deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "querySize", imports = {}))
    @JvmName(name = "-deprecated_querySize")
    /* renamed from: -deprecated_querySize  reason: not valid java name */
    public final int m13158deprecated_querySize() {
        return querySize();
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "scheme", imports = {}))
    @JvmName(name = "-deprecated_scheme")
    @NotNull
    /* renamed from: -deprecated_scheme  reason: not valid java name */
    public final String m13159deprecated_scheme() {
        return this.scheme;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to toUri()", replaceWith = @ReplaceWith(expression = "toUri()", imports = {}))
    @JvmName(name = "-deprecated_uri")
    @NotNull
    /* renamed from: -deprecated_uri  reason: not valid java name */
    public final URI m13160deprecated_uri() {
        return uri();
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to toUrl()", replaceWith = @ReplaceWith(expression = "toUrl()", imports = {}))
    @JvmName(name = "-deprecated_url")
    @NotNull
    /* renamed from: -deprecated_url  reason: not valid java name */
    public final URL m13161deprecated_url() {
        return url();
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER, imports = {}))
    @JvmName(name = "-deprecated_username")
    @NotNull
    /* renamed from: -deprecated_username  reason: not valid java name */
    public final String m13162deprecated_username() {
        return this.username;
    }

    @JvmName(name = "encodedFragment")
    @Nullable
    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        int m374r = C10929r.m374r(this.url, '#', 0, false, 6) + 1;
        String str = this.url;
        if (str != null) {
            String substring = str.substring(m374r);
            C10843j.m431e(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    @JvmName(name = "encodedPassword")
    @NotNull
    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        int m374r = C10929r.m374r(this.url, ':', this.scheme.length() + 3, false, 4) + 1;
        int m374r2 = C10929r.m374r(this.url, '@', 0, false, 6);
        String str = this.url;
        if (str != null) {
            String substring = str.substring(m374r, m374r2);
            C10843j.m431e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    @JvmName(name = "encodedPath")
    @NotNull
    public final String encodedPath() {
        int m374r = C10929r.m374r(this.url, '/', this.scheme.length() + 3, false, 4);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, "?#", m374r, str.length());
        String str2 = this.url;
        if (str2 != null) {
            String substring = str2.substring(m374r, delimiterOffset);
            C10843j.m431e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    @JvmName(name = "encodedPathSegments")
    @NotNull
    public final List<String> encodedPathSegments() {
        int m374r = C10929r.m374r(this.url, '/', this.scheme.length() + 3, false, 4);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, "?#", m374r, str.length());
        ArrayList arrayList = new ArrayList();
        while (m374r < delimiterOffset) {
            int i = m374r + 1;
            int delimiterOffset2 = Util.delimiterOffset(this.url, '/', i, delimiterOffset);
            String str2 = this.url;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String substring = str2.substring(i, delimiterOffset2);
            C10843j.m431e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring);
            m374r = delimiterOffset2;
        }
        return arrayList;
    }

    @JvmName(name = "encodedQuery")
    @Nullable
    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int m374r = C10929r.m374r(this.url, '?', 0, false, 6) + 1;
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, '#', m374r, str.length());
        String str2 = this.url;
        if (str2 != null) {
            String substring = str2.substring(m374r, delimiterOffset);
            C10843j.m431e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    @JvmName(name = "encodedUsername")
    @NotNull
    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, ":@", length, str.length());
        String str2 = this.url;
        if (str2 != null) {
            String substring = str2.substring(length, delimiterOffset);
            C10843j.m431e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof HttpUrl) && C10843j.m435a(((HttpUrl) obj).url, this.url);
    }

    @JvmName(name = "fragment")
    @Nullable
    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    @JvmName(name = "host")
    @NotNull
    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    @NotNull
    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    @Nullable
    public final Builder newBuilder(@NotNull String link) {
        C10843j.m430f(link, "link");
        try {
            return new Builder().parse$okhttp(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @JvmName(name = "password")
    @NotNull
    public final String password() {
        return this.password;
    }

    @JvmName(name = "pathSegments")
    @NotNull
    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    @JvmName(name = "pathSize")
    public final int pathSize() {
        return this.pathSegments.size();
    }

    @JvmName(name = "port")
    public final int port() {
        return this.port;
    }

    @JvmName(name = "query")
    @Nullable
    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    @Nullable
    public final String queryParameter(@NotNull String name) {
        C10843j.m430f(name, "name");
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        C10876a m412b = C10882g.m412b(C10882g.m411c(0, list.size()), 2);
        int i = m412b.f21422a;
        int i2 = m412b.f21423b;
        int i3 = m412b.f21424c;
        if (i3 < 0 ? i >= i2 : i <= i2) {
            while (!C10843j.m435a(name, this.queryNamesAndValues.get(i))) {
                if (i != i2) {
                    i += i3;
                }
            }
            return this.queryNamesAndValues.get(i + 1);
        }
        return null;
    }

    @NotNull
    public final String queryParameterName(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            String str = list.get(i * 2);
            C10843j.m433c(str);
            return str;
        }
        throw new IndexOutOfBoundsException();
    }

    @JvmName(name = "queryParameterNames")
    @NotNull
    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return C10761q.f21365a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C10876a m412b = C10882g.m412b(C10882g.m411c(0, this.queryNamesAndValues.size()), 2);
        int i = m412b.f21422a;
        int i2 = m412b.f21423b;
        int i3 = m412b.f21424c;
        if (i3 < 0 ? i >= i2 : i <= i2) {
            while (true) {
                String str = this.queryNamesAndValues.get(i);
                C10843j.m433c(str);
                linkedHashSet.add(str);
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        C10843j.m431e(unmodifiableSet, "Collections.unmodifiableSet(result)");
        return unmodifiableSet;
    }

    @Nullable
    public final String queryParameterValue(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    @NotNull
    public final List<String> queryParameterValues(@NotNull String name) {
        C10843j.m430f(name, "name");
        if (this.queryNamesAndValues == null) {
            return C10759o.f21363a;
        }
        ArrayList arrayList = new ArrayList();
        C10876a m412b = C10882g.m412b(C10882g.m411c(0, this.queryNamesAndValues.size()), 2);
        int i = m412b.f21422a;
        int i2 = m412b.f21423b;
        int i3 = m412b.f21424c;
        if (i3 < 0 ? i >= i2 : i <= i2) {
            while (true) {
                if (C10843j.m435a(name, this.queryNamesAndValues.get(i))) {
                    arrayList.add(this.queryNamesAndValues.get(i + 1));
                }
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        C10843j.m431e(unmodifiableList, "Collections.unmodifiableList(result)");
        return unmodifiableList;
    }

    @JvmName(name = "querySize")
    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    @NotNull
    public final String redact() {
        Builder newBuilder = newBuilder("/...");
        C10843j.m433c(newBuilder);
        return newBuilder.username("").password("").build().toString();
    }

    @Nullable
    public final HttpUrl resolve(@NotNull String link) {
        C10843j.m430f(link, "link");
        Builder newBuilder = newBuilder(link);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    @JvmName(name = "scheme")
    @NotNull
    public final String scheme() {
        return this.scheme;
    }

    @NotNull
    public String toString() {
        return this.url;
    }

    @Nullable
    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    @JvmName(name = "uri")
    @NotNull
    public final URI uri() {
        String input = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(input);
        } catch (URISyntaxException e) {
            try {
                Pattern compile = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                C10843j.m431e(compile, "compile(pattern)");
                C10843j.m430f(input, "input");
                String replaceAll = compile.matcher(input).replaceAll("");
                C10843j.m431e(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                URI create = URI.create(replaceAll);
                C10843j.m431e(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    @JvmName(name = ImagesContract.URL)
    @NotNull
    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @JvmName(name = AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER)
    @NotNull
    public final String username() {
        return this.username;
    }
}
