package com.example.quickstart.dao;

import com.example.quickstart.entity.Card;
import com.example.quickstart.entity.Topic;
import com.example.quickstart.entity.User;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@Data
public class LittleDao {
    public List<Card> getCard(){
        Card[] cards = {
                new Card("https://cdn.sspai.com/2018/03/25/ce2a784deb3097acb6ee9d37ea0c13ea.jpg?imageMogr2/quality/95/thumbnail/!80x80r/gravity/Center/crop/80x80", "十三",
                        "别让「每天 XX 分钟」吓到你，习惯养成其实可以很简单：Continuo | App+1", "如果你在养成习惯的过程中也感受到了无形的压力，那么不妨试试这款无需设定目标的 Continuo，帮助你在改变的同时减轻焦虑。", "https://cdn.sspai.com/2018/09/07/7453f4472eb69423dd8ca3495f63e6c5.png?imageMogr2/quality/95/thumbnail/!360x220r/gravity/Center/crop/360x220"),
                new Card("https://cdn.sspai.com/attachment/origin/2014/07/14/82455.jpg?imageMogr2/quality/95/thumbnail/!80x80r/gravity/Center/crop/80x80", "王宁",
                        "工作日让家中电脑不再闲置，其实你可以遥控它做很多事", "如果打个小算盘你就会发现家中电脑的利用率低到令人发指的地步，那么怎么才能在工作日的时候让家中的电脑也能被充分利用起来呢？", "https://cdn.sspai.com/article/0e1c925b-a32f-f056-d7d1-861f67226eca.jpg?imageMogr2/quality/95/thumbnail/!360x220r/gravity/Center/crop/360x220"),
                new Card("https://cdn.sspai.com/avatar/f0a995804d04cc8a064e21110cb04210.jpg?imageMogr2/quality/95/thumbnail/!80x80r/gravity/Center/crop/80x80", "罗氏",
                        "Chrome 在 10 周年之际发布了新版，除了好看还更安全", "Google 在 Chrome 十周年之际向全平台推送了 Chrome 69 正式版的更新，为我们带来了采用全新设计的 Google material theme 主题，同时还新增了许多新功能，特别在安全性方面做出了很大的提升。", "https://cdn.sspai.com/article/6adffdd2-2a2c-d67a-bd3c-a27e7268cd95.jpg?imageMogr2/quality/95/thumbnail/!360x220r/gravity/Center/crop/360x220"),
                new Card("https://cdn.sspai.com/2017/12/07/95c8243d52f3d8fed7472397ec018659.jpg?imageMogr2/quality/95/thumbnail/!80x80r/gravity/Center/crop/80x80", "waychane",
                        "他们做了这款 Kindle 标注管理工具，想为你带来更多读书的价值：专访 Knotes | 幕后", "Knotes 由在美国工作的国人贺乙钊和鲁周行共同打造，前者负责软件开发，后者负责产品设计。本期幕后我们就请到了 Knotes 团队的 2 位，一起聊了聊 Knotes 的计划以及他们对美国科技行业和读书这件事的看法。", "https://cdn.sspai.com/article/daaa7236-fc24-cd1a-d3b0-308d8428898d.jpg?imageMogr2/quality/95/thumbnail/!360x220r/gravity/Center/crop/360x220"),
                new Card("https://cdn.sspai.com/2018/06/07/ad1a9afa20cdbcf093680131480932d2.jpg?imageMogr2/quality/95/thumbnail/!80x80r/gravity/Center/crop/80x80", "Adventure",
                        "除了课本，你还可以在这些 App 中「涨姿势」", "正值开学季，我为你们收集了一些应用，希望能让你无论在校园内外，都能再体验一次知识的趣味。", "https://cdn.sspai.com/article/e0ec4294-bbc4-fa76-39a8-4b12164a63c0.jpg?imageMogr2/quality/95/thumbnail/!360x220r/gravity/Center/crop/360x220"),
                new Card("https://cdn.sspai.com/2017/05/19/4425a22e74cd252352e81d8eea541537.jpg?imageMogr2/quality/95/thumbnail/!80x80r/gravity/Center/crop/80x80", "Vailla",
                        "Mac 上最好用的系统清理工具大更新，现在你还可以用它更新应用：CleanMyMac X", "CleanMyMac X 率先在 Setapp 平台上推出，大版本更新不但带来了全新设计的应用界面，还新增了许多实用的工具，满足了 Mac 使用者清理系统的日常需求。", "https://cdn.sspai.com/article/618a82c7-2fa8-b12b-75c7-c1690f474ea9.jpg?imageMogr2/quality/95/thumbnail/!360x220r/gravity/Center/crop/360x220"),
                new Card("https://cdn.sspai.com/2018/02/13/c986466bef23d1cb4485780db7fa8b5b.jpg?imageMogr2/quality/95/thumbnail/!80x80r/gravity/Center/crop/80x80", "PhilGu",
                        "跑步不想带手机？这款应用让你只用 Apple Watch 就能听播客：Outcast丨App+1", "你有没有想过，无需 iPhone 在 Apple Watch 上也能直接听播客呢？本文介绍的 Outcast 就可以满足你这个需求。", "https://cdn.sspai.com/article/d4e2b78b-7b2c-59b5-181e-0fc9c93bcda3.jpg?imageMogr2/quality/95/thumbnail/!360x220r/gravity/Center/crop/360x220")
        };
        List<Card>cardList= Arrays.asList(cards);
        return cardList;
    }

    public List<Topic>getTopic(){
        Topic[] topics={
                new Topic("https://cdn.sspai.com/topic/26a76ccb-288e-6126-6da4-cd36c8a354fd.jpg?imageMogr2/quality/95/thumbnail/!828x445r/gravity/Center/crop/828x445","跑步好搭档"),
                new Topic("https://cdn.sspai.com/topic/0f501728-95c1-769a-d1ec-56474f9fbfd6.jpg?imageMogr2/quality/95/thumbnail/!828x445r/gravity/Center/crop/828x445","给现代人的护眼小技巧"),
                new Topic("https://cdn.sspai.com/topic/72f63d62-0094-812c-8be3-1f5b16d677e0.jpg?imageMogr2/quality/95/thumbnail/!828x445r/gravity/Center/crop/828x445","青年居家生活指南"),
                new Topic("https://cdn.sspai.com/topic/9eb4e572-c283-e5ac-5fd9-9e3fcc54dda5.jpg?imageMogr2/quality/95/thumbnail/!828x445r/gravity/Center/crop/828x445","你应该知道的 PPT 技巧"),
        };
        List<Topic>topicList=Arrays.asList(topics);
        return topicList;
    }

    public User getUser(){
        User user=new User();
        user.setAvatar("logo.jpg");
        user.setName("王宁");
        return user;
    }
}