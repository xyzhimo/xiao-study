package base;

import com.sxc.diamond.config.DiamondHandler;
import com.sxc.diamond.manager.ManagerListenerAdapter;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Service
public class Demo {

    @Resource
    private DiamondHandler diamondHandler;

    @PostConstruct
    public void init() {
        diamondHandler.receiveConfigInfo("item-center", "item-service", new ManagerListenerAdapter() {
            @Override
            public void receiveConfigInfo(String s) {
                System.out.println("接受到数据:\n" + s);
                // TODO: 首次启动会调用该方法，后续如果有数据更新，该方法会被回调。
                // TODO: 所以通常这方法一般是将配置数据解析，放入内存中，供后续使用。
            }
        });
    }
}
