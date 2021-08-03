package mqray.cn.observerMode;

/**
 * @author ray
 * Date 8/3/21
 */
public class RegPromotionObserver {

    // 依赖注入
    private PromotionService promotionService;

    public RegPromotionObserver() {
        promotionService = new PromotionService();
    }

    @Subscribe
    public void handleRegSuccess(Long userId) {
        System.out.println("handleRegSuccess...");
        promotionService.issueNewUserExperienceCash(userId);
    }
}
