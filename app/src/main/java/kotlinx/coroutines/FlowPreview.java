package kotlinx.coroutines;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.RequiresOptIn;
import kotlin.annotation.EnumC10736a;
import kotlin.annotation.EnumC10737b;
import kotlin.annotation.MustBeDocumented;

@Target({ElementType.TYPE, ElementType.METHOD})
@RequiresOptIn(level = RequiresOptIn.EnumC10734a.WARNING, message = "This declaration is in a preview state and can be changed in a backwards-incompatible manner with a best-effort migration. Its usage should be marked with '@kotlinx.coroutines.FlowPreview' or '@OptIn(kotlinx.coroutines.FlowPreview::class)' if you accept the drawback of relying on preview API")
@kotlin.annotation.Target(allowedTargets = {EnumC10737b.CLASS, EnumC10737b.FUNCTION, EnumC10737b.TYPEALIAS, EnumC10737b.PROPERTY})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(EnumC10736a.BINARY)
@MustBeDocumented
@Metadata(m509d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m508d2 = {"Lkotlinx/coroutines/FlowPreview;", "", "kotlinx-coroutines-core"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
@Documented
/* loaded from: classes3.dex */
public @interface FlowPreview {
}
