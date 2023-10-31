package libv2ray;

import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import android.util.Log;
import java.io.FileDescriptor;
import kotlin.C10864l;
import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.jvm.internal.AbstractC10790f;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.p061io.C10805a;
import kotlinx.coroutines.InterfaceC10976e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m508d2 = {"Lkotlinx/coroutines/e0;", "Lkotlin/p;", "<anonymous>"}, m507k = 3, m506mv = {1, 8, 0})
@DebugMetadata(m454c = "libv2ray.GoFlyVpnService$sendFd$1", m453f = "GoFlyVpnService.kt", m452i = {}, m451l = {}, m450m = "invokeSuspend", m449n = {}, m448s = {})
/* loaded from: classes3.dex */
public final class GoFlyVpnService$sendFd$1 extends AbstractC10790f implements InterfaceC10824p<InterfaceC10976e0, InterfaceC10772d<? super C10868p>, Object> {
    final /* synthetic */ FileDescriptor $fd;
    final /* synthetic */ String $path;
    int label;
    final /* synthetic */ GoFlyVpnService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoFlyVpnService$sendFd$1(GoFlyVpnService goFlyVpnService, String str, FileDescriptor fileDescriptor, InterfaceC10772d<? super GoFlyVpnService$sendFd$1> interfaceC10772d) {
        super(2, interfaceC10772d);
        this.this$0 = goFlyVpnService;
        this.$path = str;
        this.$fd = fileDescriptor;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @NotNull
    public final InterfaceC10772d<C10868p> create(@Nullable Object obj, @NotNull InterfaceC10772d<?> interfaceC10772d) {
        return new GoFlyVpnService$sendFd$1(this.this$0, this.$path, this.$fd, interfaceC10772d);
    }

    @Override // kotlin.jvm.functions.InterfaceC10824p
    @Nullable
    public final Object invoke(@NotNull InterfaceC10976e0 interfaceC10976e0, @Nullable InterfaceC10772d<? super C10868p> interfaceC10772d) {
        return ((GoFlyVpnService$sendFd$1) create(interfaceC10976e0, interfaceC10772d)).invokeSuspend(C10868p.f21418a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        if (this.label == 0) {
            C10864l.m418b(obj);
            int i = 0;
            while (true) {
                try {
                    Thread.sleep(1000 << i);
                    LocalSocket localSocket = new LocalSocket();
                    String str = this.$path;
                    FileDescriptor fileDescriptor = this.$fd;
                    localSocket.connect(new LocalSocketAddress(str, LocalSocketAddress.Namespace.FILESYSTEM));
                    localSocket.setFileDescriptorsForSend(new FileDescriptor[]{fileDescriptor});
                    localSocket.getOutputStream().write(42);
                    C10868p c10868p = C10868p.f21418a;
                    C10805a.m443a(localSocket, null);
                    break;
                } catch (Exception e) {
                    Log.e(this.this$0.getPackageName(), e.toString());
                    if (i > 5) {
                        break;
                    }
                    i++;
                }
            }
            return C10868p.f21418a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
