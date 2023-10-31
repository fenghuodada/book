package com.applovin.impl.communicator;

import android.content.Context;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class MessagingServiceImpl implements AppLovinCommunicatorMessagingService {

    /* renamed from: a */
    private final Context f6704a;

    /* renamed from: c */
    private final Map<String, Queue<CommunicatorMessageImpl>> f6706c = new HashMap();

    /* renamed from: d */
    private final Object f6707d = new Object();

    /* renamed from: b */
    private final ScheduledThreadPoolExecutor f6705b = m8854a();

    public MessagingServiceImpl(Context context) {
        this.f6704a = context;
    }

    /* renamed from: a */
    private Queue<CommunicatorMessageImpl> m8850a(String str) {
        LinkedList linkedList;
        synchronized (this.f6707d) {
            Queue<CommunicatorMessageImpl> queue = this.f6706c.get(str);
            linkedList = queue != null ? new LinkedList(queue) : new LinkedList();
        }
        return linkedList;
    }

    /* renamed from: a */
    private ScheduledThreadPoolExecutor m8854a() {
        return new ScheduledThreadPoolExecutor(4, new ThreadFactory() { // from class: com.applovin.impl.communicator.MessagingServiceImpl.2
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "AppLovinSdk:com.applovin.communicator");
                thread.setPriority(10);
                thread.setDaemon(true);
                return thread;
            }
        });
    }

    /* renamed from: a */
    private void m8853a(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (appLovinCommunicatorMessage.sticky) {
            synchronized (this.f6707d) {
                Queue<CommunicatorMessageImpl> queue = this.f6706c.get(appLovinCommunicatorMessage.getTopic());
                if (queue != null) {
                    queue.add(appLovinCommunicatorMessage);
                    if (queue.size() > 100) {
                        queue.remove();
                    }
                } else {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(appLovinCommunicatorMessage);
                    this.f6706c.put(appLovinCommunicatorMessage.getTopic(), linkedList);
                }
            }
        }
    }

    /* renamed from: a */
    private void m8852a(final CommunicatorMessageImpl communicatorMessageImpl) {
        this.f6705b.execute(new Runnable() { // from class: com.applovin.impl.communicator.MessagingServiceImpl.1
            @Override // java.lang.Runnable
            public void run() {
                AppLovinBroadcastManager.getInstance(MessagingServiceImpl.this.f6704a).sendBroadcastSync(communicatorMessageImpl, null);
            }
        });
    }

    public void maybeFlushStickyMessages(String str) {
        for (CommunicatorMessageImpl communicatorMessageImpl : m8850a(str)) {
            m8852a(communicatorMessageImpl);
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorMessagingService
    public void publish(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        m8852a((CommunicatorMessageImpl) appLovinCommunicatorMessage);
        m8853a(appLovinCommunicatorMessage);
    }

    public String toString() {
        return "MessagingServiceImpl{}";
    }
}
