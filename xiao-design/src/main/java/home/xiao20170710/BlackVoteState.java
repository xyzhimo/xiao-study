package home.xiao20170710;

/**
 * Created by Xiao on 2017/7/10 0010.
 */
public class BlackVoteState implements State {

    public void vote(String user, String voteItem, VoteManager voteManager) {
        //记录黑名单中，禁止登录系统
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }
}
