/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 80035 (8.0.35)
 Source Host           : localhost:3306
 Source Schema         : my_schedule

 Target Server Type    : MySQL
 Target Server Version : 80035 (8.0.35)
 File Encoding         : 65001

 Date: 23/01/2024 17:48:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for constellation
-- ----------------------------
DROP TABLE IF EXISTS `constellation`;
CREATE TABLE `constellation` (
  `id` bigint NOT NULL,
  `name` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `icon` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `start_date` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `end_date` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `xztd` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `sxsx` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `zggw` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `yysx` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `zdtz` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `zgxx` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `xyys` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `jxsw` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `xyhm` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `kyjs` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `bx` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `yd` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `qd` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `jbtz` varchar(250) COLLATE utf8mb4_unicode_ci NOT NULL,
  `jttz` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `xsfg` varchar(250) COLLATE utf8mb4_unicode_ci NOT NULL,
  `gxmd` varchar(250) COLLATE utf8mb4_unicode_ci NOT NULL,
  `zj` varchar(250) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of constellation
-- ----------------------------
BEGIN;
INSERT INTO `constellation` (`id`, `name`, `icon`, `start_date`, `end_date`, `xztd`, `sxsx`, `zggw`, `yysx`, `zdtz`, `zgxx`, `xyys`, `jxsw`, `xyhm`, `kyjs`, `bx`, `yd`, `qd`, `jbtz`, `jttz`, `xsfg`, `gxmd`, `zj`) VALUES (1, '射手座', 'ss.svg', '11-23', '12-21', '自由乐观', '火', '第九宫', '阳性', '自由', '木星', '浅蓝色', '紫水晶', '6', '锡', '乐观开朗、自由率真', '风趣幽默，崇尚自由，讲义气。', '粗心大意，太爱冒险，浮躁，好吹嘘。', '太阳位于射手座的人，生性乐观开朗，热情奔放，崇尚自由，反应灵敏，极具创造力。待人友善又极具豪气，作风非常海派，人缘颇佳。', '射手座是黄道宫上的第九个星座，主宰星为木星。有着轻松愉快、活泼开朗的人生观。太阳落在射手座，做人非常坦荡，待人真诚热情，积极乐观的一面很吸引人，非常受人欢迎。你属于乐观、坦率、聪慧的类型，喜欢特立独行，颇富直觉与鼓舞他人的力量，思想开明、适应力强，不拘小节，生性幽默，很懂得享受生活。对你而言，生活就是一连串的探险，喜欢追求新奇有趣的经验。', '你很够朋友、讲义气，朋友遍天下，四处有贵人；精力充沛，做事效率高，可以身兼数职，但常常是虎头蛇尾，易半途而废；爱冒险，行动敏捷。', '你有时做事稍欠考虑，有过于草率之嫌；不守规则，有时还会幽默过头，或是说话太过直接，得罪人而不自知；太过自由，显得散漫；做事求快而不注重细节，易出错，有时还显得三心二意，非常粗心。', '射手座崇尚自由，勇敢、果断、独立，身上有一股勇往直前的劲儿，不管有多困难，只要想，就能做，你的毅力和自信是难以击倒的。射手男酷爱自由，讨厌被束缚，射手女性格简单直接，不耍心计，可是任性。');
INSERT INTO `constellation` (`id`, `name`, `icon`, `start_date`, `end_date`, `xztd`, `sxsx`, `zggw`, `yysx`, `zdtz`, `zgxx`, `xyys`, `jxsw`, `xyhm`, `kyjs`, `bx`, `yd`, `qd`, `jbtz`, `jttz`, `xsfg`, `gxmd`, `zj`) VALUES (2, '水瓶座', 'sp.svg', '01-20', '02-18', '自由博爱', '风', '第十一宫', '阳性', '求知', '天王星', '古铜色', '黑珍珠', '22', '蛋白石', '时尚', '求新求变，好奇心强，博爱，有远见。', '多变，叛逆，倔强，自我中心。', '太阳位于水瓶座的人，极富革新精神，具有独特的个性，有着超前的思想，是新思想的开拓者。聪颖脱俗，常有奇异的想法，不按牌理出牌。\n', '水瓶座是黄道宫上的第十一个星座，主宰星为天王星，思想前卫，有开拓精神。太阳落在水瓶座的你，是一个反习俗、不愿随声附和的人，说话和做事全凭自己的兴趣，很有自己的主张，追求独一无二的生活方式，物质享受与精神充实一样重要。个性友善博爱、有创意和远见，善于观察分析。好奇心强，但会用理智分析，常常把强烈的愿望和独立精神融合在一起。喜欢自由自在的生活，随心所欲地思考并做出决定。\n', '你很有才华，喜欢创意，不喜欢一成不变的工作，重视逻辑思考的过程，在工作上常常有许多点子，也很喜欢做规划，但对结果却不太在意；在工作上也喜欢与大家分工合作，你动脑策划他人出力。\n', '你需要注意的是，有时太过于执着，因而显得有点固执，容易以自我为中心；喜欢创新、体现与众不同，也容易夸大问题；太讲求客观，易给人冷漠无情的印象。\n', '水瓶座的人很聪明，他们最大的特点是创新，追求独一无二的生活，个人主义色彩很浓重的星座。他们对人友善又注重隐私。水瓶座绝对算得上是”友谊之星“，他喜欢结交每一类朋友，但是确很难与他们交心，那需要很长的时间。他们对自己的家人就显得冷淡和疏远很多了。');
INSERT INTO `constellation` (`id`, `name`, `icon`, `start_date`, `end_date`, `xztd`, `sxsx`, `zggw`, `yysx`, `zdtz`, `zgxx`, `xyys`, `jxsw`, `xyhm`, `kyjs`, `bx`, `yd`, `qd`, `jbtz`, `jttz`, `xsfg`, `gxmd`, `zj`) VALUES (3, '双鱼座', 'sy.svg', '02-19', '03-20', '浪漫梦幻', '水', '第十二宫', '阴性', '滥情', '海王星', '白色', '象牙石', '11', '铜', '感性、多情、艺术', '温柔体贴，感情丰富，气质迷人。', '多愁善感，爱幻想，敏感、逃避。', '太阳位于双鱼座的人，内向害羞，有着浓厚的艺术气息。柔情似水，浪漫多情，天真烂漫，会有许多梦幻般的想法，只是有时显得不切实际。', '双鱼座是黄道宫上最后一个星座，主宰星为海王星，注重心灵，非常感性。太阳落在双鱼座的你，性格上体贴、思想脱俗、多才多艺，身上有一种令人难以抗拒的奇异的魅力。你极具浪漫情怀，在知性与感性的冲击下，往往能成为一个无与伦比的艺术家。生性善解人意、坦诚而迷人，喜欢罗曼蒂克的感觉。而且，极富同情心，乐于助人，喜欢奉献，不会随意伤人，看不得他人受到伤害，以及痛苦的表情。', '你擅长抽象的思考，在艺术气息良好的环境中能激发出你的创作灵感，不太喜欢规划，从事与艺术相关的工作较能发挥你的潜能；注重内在感受及精神层面，对现实问题不太在乎；待人友善，没有心机，人际关系良好。', '你喜欢幻想而容易变得多愁；想得过多有时会悲观，缺乏自信及面对现实的勇气，开创性不足；情绪变动剧烈，较感情用事，易给身边的朋友带来困扰；缺乏决断力和意志力，常受外界干扰，反应力较弱。\n', '双鱼座是十二宫最后一个星座，他集合了所有星座的优缺点于一身，同时受水象星座的情绪化影响，使他们原来复杂的性格又添加了更复杂的一笔。双鱼座的人最大的优点是有一颗善良的心，他们愿意帮助别人，甚至是牺牲自己。');
INSERT INTO `constellation` (`id`, `name`, `icon`, `start_date`, `end_date`, `xztd`, `sxsx`, `zggw`, `yysx`, `zdtz`, `zgxx`, `xyys`, `jxsw`, `xyhm`, `kyjs`, `bx`, `yd`, `qd`, `jbtz`, `jttz`, `xsfg`, `gxmd`, `zj`) VALUES (4, '白羊座', 'by.svg', '03-21', '04-19', '热情活力', '火', '第一宫', '阳性', '控制', '火星', '红色', '红宝石', '5', '铁', '活力四射、自我、冲动', '精力充沛，行动为先，极富创造力。', '喜怒无常，草率行事，不计后果。\n', '太阳位于牡羊座的人乐观活泼、敢做敢当，干劲十足，属于剑及履及的行动派，是急行侠、探险家。但有时显得没有耐性，冲动易怒，太过冒险。', '牡羊座是黄道十二宫的第一个星座，这让你有着孩童般的纯真、坦率，同样，也有着与生俱来的创造力，表现出强烈的领导欲望及企图心。太阳落在牡羊座的人是个急先锋，以自我为中心，想到就出发，不爱犹豫；非常享受快节奏的生活步调，冲在最前面才最有优越感。牡羊座的主宰行星是火星，在火星的主导之下，羊族人活力充沛，不畏艰险；力争前茅，惟有竞争才能让你感觉到存在的价值；非常乐观，不畏挫折，在人生的舞台上积极追求成功。\n', '牡羊座是属于春天的星座，在万物复苏、春意盎然的季节出生，使得羊族人的体内充满了冒险因子，精力旺盛，思维异常活跃；这些特质都使得你凡事都抢在最前面，一马当先，开创力十足，让人感觉不可超越；为了首开先河，甚至会铤而走险，是个十足的开创型英雄。\n', '积极的另一面就是冲动、轻率，太爱冒险、思虑不周，很容易因此而陷入困境，人生大起大落，易把风险当机会；而直肠子的火爆性格常让你得罪人而不自知。站得高、看得远一点，行动前先思虑三秒，多站在他人的立场考虑问题，博采众议、广纳雅言，这些都是羊族的子民们应努力修行的生命议题。\n', '白羊座有一种让人看见就觉得开心的感觉，因为总是看起来都是那么地热情、阳光、乐观、坚强，对朋友也慷慨大方，性格直来直往，就是有点小脾气。白羊男有大男人主义的性格，而白羊女就是女汉子的形象。');
INSERT INTO `constellation` (`id`, `name`, `icon`, `start_date`, `end_date`, `xztd`, `sxsx`, `zggw`, `yysx`, `zdtz`, `zgxx`, `xyys`, `jxsw`, `xyhm`, `kyjs`, `bx`, `yd`, `qd`, `jbtz`, `jttz`, `xsfg`, `gxmd`, `zj`) VALUES (5, '金牛座', 'jn.svg', '04-20', '05-20', '稳健固执', '土', '第二宫', '阴性', '财富', '金星', '粉色', '翡翠、玉', '6', '木', '稳定、务实、享受', '沉稳踏实，重视特质，观察力敏锐。', '顽固，太过实际，依赖心强。', '太阳位于金牛座的人给人的感觉稳重、务实，追求稳定与和谐，害怕变动，属于享受派。喜欢安定，最怕没有安全感。但有时显得固执己见，对钱财看得很重。', '太阳落在金牛座的人追求舒适的生活环境，向往高品质的生活，乐于追求金钱，对美好的物质享受充满欲望。稳定和安全感是你衡量事物的唯一标准，是你执着的追求。做任何事若感觉仍有不确定因素存在，不会轻易地涉入，但一旦决心已定，将全力以赴，九头牛也拉你不动。另外，你对于和身体相关的事物都很感兴趣，包括性爱、饮食、运动等，欣赏一切美丽的事物。敏锐的洞察力也让你很能了解他人的心思，是重感情的人。', '你思虑周全，行事谨慎，拟定计划是你的强项。在行动前就会考虑到前因后果，分析利弊，而后才会择机小心翼翼地投入，要你打没把握的仗比登天还难。\n', '你的赚钱欲望强烈，也易赚到钱，但也是一个十足的拜金主义者，易给人铁公鸡一毛不拔的印象，别把钱财看得太重；你行事过于谨慎，易错过良机，应加强行动力，思虑太多易将动力消磨殆尽；有时显得倔强，发起牛脾气来还挺吓人，稍加控制情绪，你的人际关系会更加圆融，提升贵人助力。', '金牛座很保守，喜欢稳定，一旦有什么变动就会觉得心里不踏实，性格也比较慢热，但你是理财高手，对于投资理财都有着独特的见解。金牛男的性格有点儿自我，而金牛女就喜欢投资自己，想要过得更好。');
INSERT INTO `constellation` (`id`, `name`, `icon`, `start_date`, `end_date`, `xztd`, `sxsx`, `zggw`, `yysx`, `zdtz`, `zgxx`, `xyys`, `jxsw`, `xyhm`, `kyjs`, `bx`, `yd`, `qd`, `jbtz`, `jttz`, `xsfg`, `gxmd`, `zj`) VALUES (6, '双子座', 'szz.svg', '05-21', '06-21', '花心多变', '风', '第三宫', '阳性', '思想', '水星', '黄色', '猫眼石', '7', '水银', '灵活、沟通、口才', '沟通力强，思维活跃。', '善辩，多变，难以专精。', '太阳位于双子座的人，思维跳跃，口才伶俐，鬼点子多，常语出惊人，但有三心二意的倾向，情绪起伏多变，难以专心。', '双子座是黄道宫上的第三个星座，受水星守护，思维敏捷，有良好的沟通能力，反应迅速，适应力强。太阳落在双子座的人追求并享受生动、多姿多彩、富于变化的生活环境，平淡、一成不变的环境难以引起你的兴趣。因为你有很强的交际能力，所以身边不缺朋友，风趣机智的表现也常受身边人的欢迎。在好奇心的驱使下，你对新知有着强烈的求知欲，接受力强，因此储备了满腹的新知和话题，让你颇有优越感。', '处变不惊，“变”是你的永恒追求，越是变动的环境越能激起你的挑战神经，如此才刺激，令你感到兴奋，做起事来也更加的起劲。追求变化、有创意才是你的行事风格，为了达到效果，不惜夸大其辞。', '太阳位于双子座的人具有双重性格，情绪变化快速，做事有虎头蛇尾的倾向，应加强耐性，培养静心的功夫，更专心一些；因为想像力丰富，接收的讯息太多，使得你内心常处于矛盾状态，常有令人不解的举动；凡事据理力争，太好辩，易与人发生言语冲突。\n', '双子座喜欢追求新鲜感，有点儿小聪明，就是耐心不够，往往做事都是三分钟热度，难以坚持，但是你的可爱性格会让很多人都喜欢跟你做朋友。双子男表面很花心，其实深情，而双子女就喜欢求新和求变。');
INSERT INTO `constellation` (`id`, `name`, `icon`, `start_date`, `end_date`, `xztd`, `sxsx`, `zggw`, `yysx`, `zdtz`, `zgxx`, `xyys`, `jxsw`, `xyhm`, `kyjs`, `bx`, `yd`, `qd`, `jbtz`, `jttz`, `xsfg`, `gxmd`, `zj`) VALUES (7, '巨蟹座', 'jx.svg', '06-22', '07-22', '敏感柔情', '水', '第四宫', '阴性', '感觉', '月亮', '绿色', '珍珠', '2', '金', '顾家、念旧、关怀', '情感丰富，亲切温暖，善解人意。', '多愁善感，沉溺往事，逃避现实。\n', '太阳位于巨蟹座的人，亲切有礼，感情丰富、细腻，有很强的感受力，具有母性的博爱之心，属于居家派的。但情绪起伏，有逃避倾向。', '巨蟹座是黄道宫上的第四个星座，主宰星为月亮。心思细密，感受力非常强，保护他人的意识强烈，家庭观念浓厚，有强烈的责任心及牺牲奉献精神。太阳落在巨蟹座的人擅长持家，喜欢安定祥和的家庭氛围，对长辈孝顺，对兄弟姐妹、朋友非常友善，努力创造你想要的和谐与美满。当然，你的自我保护的意识也非常强烈，一点点的风吹草动都有可能让你心潮起伏，当他人侵犯了你内心的那块净土时，你也会伸出钳子示威。', '你善于与人共事，凡事喜欢与人分享，行事谨慎，有自己的想法和追求，但不轻易表现出来，更希望他人能感受到你的内心想法。害怕竞争激烈的环境，在和乐的气氛中做事，才能让你感到安心，也能激发出你的潜能。', '自信、动力不足，遇到挫折易打退堂鼓；心灵较脆弱，经不起打击，情绪低落，常沉迷于自我设想的悲伤里；有逃避心理，害怕面对现实，情绪易跟着他人起舞，过度保护自己。应加强信心，多自我鼓励，卸下心中的包袱。', '巨蟹座的情绪容易敏感，也缺乏安全感，容易对一件事情上心，做事情有坚持到底的毅力，为人重情重义，对朋友、家人都特别忠实，巨蟹男是一等一的好男人，顾家爱家人，巨蟹女充满母性光环，非常有爱心。');
INSERT INTO `constellation` (`id`, `name`, `icon`, `start_date`, `end_date`, `xztd`, `sxsx`, `zggw`, `yysx`, `zdtz`, `zgxx`, `xyys`, `jxsw`, `xyhm`, `kyjs`, `bx`, `yd`, `qd`, `jbtz`, `jttz`, `xsfg`, `gxmd`, `zj`) VALUES (8, '狮子座', 'sz.svg', '07-23', '08-22', '骄傲威严', '火', '第五宫', '阳性', '权力', '太阳', '红色、黄色', '琥珀', '19', '黄金', '王者、自信、大方', '领导力强，很有主见，行动力十足。', '自傲，独断，暴躁，欲望强烈。\n', '太阳位于狮子座的人，自信自强，气度非凡，极具领导统御能力，永不服输，是天生的贵族、王者。只是有时过度追求利，甚至有些自负，莽撞、以自我为中心。', '狮子座是黄道宫上的第五个星座，主宰星为太阳。阳光灿烂，充满活力，感觉有用不完的能量；表现欲强烈，举手投足之间充满了闪耀的魅力，很容易成为众人瞩目的焦点，你身上散发出来的热力很容易感染周围的人，让大家跟着你一起舞动生活。你对权力地位的追求非常执着，以捍卫你的领导地位，而这也是你不断向前的动力泉源。这往往让你站得比别人高，获得也比别人多，但人生大起大落；自尊心很强，当追求无望时会变得沉沦、怠惰。', '有话直说，直截了当，从不拐弯抹角，胸怀坦荡；在工作上展现出高度的自信，做事雷厉风行，挑战权威，在挑战中寻求刺激，获得成就感；待人大方慷慨，野心勃勃，喜欢被人推崇、膜拜，无人关注会感失落。', '欲望太强，太重面子，得失心较重，骄傲自负，这会让你变得孤立无援；太爱冒险，甚至鲁莽，易损失惨重。舍弃得失心，平和及定性是你需要加强的修为。', '狮子座有着宏伟的理想，总想靠自己的努力成为人上人，你向往高高在上的优越感，也期待被仰慕被崇拜的感觉，有点儿自信有点儿自大。狮子男的大男人气息很重，爱面子，狮子女热情阳光，对朋友讲义气。');
INSERT INTO `constellation` (`id`, `name`, `icon`, `start_date`, `end_date`, `xztd`, `sxsx`, `zggw`, `yysx`, `zdtz`, `zgxx`, `xyys`, `jxsw`, `xyhm`, `kyjs`, `bx`, `yd`, `qd`, `jbtz`, `jttz`, `xsfg`, `gxmd`, `zj`) VALUES (9, '处女座', 'cn.svg', '08-23', '09-22', '完美理性', '土\n', '第六宫', '阴性', '分析力', '水星', '灰色', '蓝宝石、琥珀', '7', '水银', '细心、挑剔、分析', '心思缜密，善于分析研究，追求完美。', '吹毛求疵，洁癖，保守、严肃。\n', '太阳位于处女座的人，思虑周全，非常谦虚，谨慎保守，很有耐心，擅长分析，凡事要求做到尽善尽美，是个完美主义者。但易给人较大的压力，较被动严肃。', '处女座是黄道宫的第六个星座，主宰星为水星。思路清晰，冷静理性，待人真诚，但保持一定的距离；对自我要求甚高，脚踏实地默默努力，以达成目标，构筑更美好的生活。受到主宰星水星的影响，你独立，思维敏捷，乐于为人服务，易受人欢迎。生活态度严谨，要求一丝不苟，有自己的道德底线，不会乱来；喜欢安静舒适的环境，最怕无序、杂乱无章；你也希望获得周围人的肯定，听到认同的声音你会更有斗志。', '太阳落在处女座的人做事条理分明，不急躁，稳步前进；细腻的思路和谨慎、耐心的行事作风，让你很容易成为优秀者，在群体中脱颖而出。求知欲望强烈，觉得没有知识是很丢人的事，会拚命地充实自我。', '太过要求完美，心理承受着较大的压力，容易自我设限，不易放开胸怀；太过小心翼翼，有矫枉过正的嫌疑；太注重细节，往往见树不见林。应释放压力，开阔胸襟，多与人群接触，交流互动可让你收获更多。\n', '处女座虽然常常被黑，但你还是依然坚持追求自己的完美主义，因为在你看来，生活不能将就，追求的完美更不能将就，有目标才有进步，当然也需要鼓励。处女男的毅力很强，能坚持，处女女的求知欲很强。');
INSERT INTO `constellation` (`id`, `name`, `icon`, `start_date`, `end_date`, `xztd`, `sxsx`, `zggw`, `yysx`, `zdtz`, `zgxx`, `xyys`, `jxsw`, `xyhm`, `kyjs`, `bx`, `yd`, `qd`, `jbtz`, `jttz`, `xsfg`, `gxmd`, `zj`) VALUES (10, '天秤座', 'tc.svg', '09-23', '10-23', '公平和谐', '风', '第七宫', '阳性', '衡量抉择', '金星', '褐色', '珊瑚、琥珀', '3', '木', '和谐', '优雅，友善，善于交际。', '犹豫不决，怕寂寞，以貌取人。', '太阳位于天秤座的人很有气质，谈吐应对得体，善于与人沟通协调，是绝佳的谈判人才，属于迷人优雅派人物。只不过，思想易左右摇摆；追求外表光鲜，易失去自我。', '天秤座是黄道宫上的第七个星座，主宰星为金星。你极具风度，浑身充满了优雅的贵族气息，喜欢与人群接触，不喜欢单打独斗，对于具有美感的事物特别感兴趣，出色的交际能力让你很容易与人打成一片；你很注意自己的外在形象，希望在他人面前表现出完美的一面，但也易让人感觉虚荣、做作。你喜欢从正反两面看待问题，力求公平公正，最怕冲突和不协调；有一套自己人生哲学，懂得享受生活。', '太阳落在天秤座的你，凡事要求公平，遇事从多角度思考，以达到你所追求的平等；热衷于团队合作，在轻松愉快的环境中工作可以激发出你的热情，会有非常出色的表现。只是有时太追求平衡，反而难以达到更好的效果。', '有时神经过敏，显得神经质，常常处于焦虑不安的状态；意志薄弱，遇事摇摆不定，难以抉择，常给人瞻前顾后的印象，显得懦弱。应放松身心，释放压力，增强魄力与行动力，快速作出决定。\n', '天秤座常常追求平等、和谐，擅于察言观色，交际能力很强，因此真心朋友不少，因为你也足够真诚，但是最大的缺点就是面对选择总是犹豫不决。天秤男容易在乎自己而忽略别人，天秤女就喜欢被陪伴的感觉。');
INSERT INTO `constellation` (`id`, `name`, `icon`, `start_date`, `end_date`, `xztd`, `sxsx`, `zggw`, `yysx`, `zdtz`, `zgxx`, `xyys`, `jxsw`, `xyhm`, `kyjs`, `bx`, `yd`, `qd`, `jbtz`, `jttz`, `xsfg`, `gxmd`, `zj`) VALUES (11, '天蝎座', 'tx.svg', '10-24', '11-22', '神秘敏锐', '水', '第八宫', '阴性', '渴望', '冥王星', '紫色、黑色', '碧玉、黑水晶', '4', '铁', '神秘、冷静、直觉', '明察秋毫，高瞻远瞩，有毅力。\n', '孤僻自怜，占有欲强，有时显得冷漠。', '太阳位于天蝎座的人，外表低调，实则企图心旺盛，充满神秘感，不会轻易地与人互动。对自我要求很高，极具竞争力与战斗力，有洞悉他人心思的能力。', '天蝎座是黄道宫上的第八个星座，主宰星为冥王星，能量强大、精力旺盛，有强烈责任感，韧性强、黑白分明、意志力强、支配欲强烈，对于生命的奥秘有独特的见解。你的城府颇深，待人处事非常冷静理性，不苟言笑，有着强烈的第六感，以及神秘的吸引力，虽然有着敏锐的观察力，但往往仍靠感觉来决定一切。你深沉的面孔常让身边的人感到不舒服，对你敬而远之；很懂得察言观色，但讨厌他人探听你的内心世界。', '凡事自有主张，三思而后行，有着谨慎、冷静的行事风格，非常注重过程，在设想、架构上会花费较多的时间和精力。工作冷静理性，意志坚定，设立目标后不会轻易放弃，会用稳扎稳打的方式实现目标。', '有孤僻的倾向，不喜欢与人过深的交往，相较于群体活动，更喜欢享受一个人的独处；对他人有不信任感，凡事亲力亲为；较孤傲，表现出很强的戒备心，令人难以亲近。应消除顾忌，再果敢开放一些，拓展人脉，你的人生格局才会更大。', '天蝎座精力旺盛、占有欲极强，对于生活很有目标，不达到目的誓不罢休，复仇心理重，记仇会让自己不顾一切报复曾经伤害过你的人。天蝎男自我主义色彩很强烈，天蝎女的自我保护意识很强，不容易接近。');
INSERT INTO `constellation` (`id`, `name`, `icon`, `start_date`, `end_date`, `xztd`, `sxsx`, `zggw`, `yysx`, `zdtz`, `zgxx`, `xyys`, `jxsw`, `xyhm`, `kyjs`, `bx`, `yd`, `qd`, `jbtz`, `jttz`, `xsfg`, `gxmd`, `zj`) VALUES (12, '摩羯座', 'mj.svg', '12-22', '01-19', '执著现实', '土', '第十宫', '阴性', '实际', '土星', '咖啡色、黑', '黑玉', '4', '银', '刻板，保守，孤独，消极。', '深思熟虑，冷静判断，责任感强。', ' 企图心、沉稳\n表现: 刻板，保守，孤独，消极。', '太阳位于摩羯座的人，很有自己的想法，很注重实际，耐力十足，意志坚定，有很强的时间观念，重视权威和名声，有不错的组织领导能力，是值得依赖的人', '摩羯座是黄道宫上的第十个星座，主宰星为土星，有着成熟认真的人生观。太阳落在摩羯座的人，就像将领，能担当大任，追求高难度的理想，喜欢控制全局，善于独立实现自己心中的理想。喜欢从容不迫、深思熟虑，待人亲切和蔼、心胸宽广、有抱负，以踏实的方式追求成功，信奉有付出就会有回报的信条。一步一个脚印，即使遇到挫折也能坚持下去，顽强的毅力及耐力是你迈向成功的不二法门。\n', '你做事脚踏实地，行事低调深沉，竭尽全力去超越跑在前面的人，不会存有侥幸心理。善于计划，而且按部就班的执行;任何事都讲求公平合理，凡事能运筹帷幄，从一而终，令人放心且欣赏。', '你比较严肃，不容易亲近，有时过于坚持己见，会有点顽固;内心有着极度的不安全感，对他人不太信任;情绪较压抑，容易给自己施加太大的压力。应放轻松一些，别让神经总是处于紧张状态，休息才能走更长远的路。', '摩羯座是十二星座中最有耐心，为事最小心、也是最善良的星座。他们做事脚踏实地，也比较固执，不达目的是不会放手的。他们的忍耐力也是出奇的强大，同时也非常勤奋。他们心中总是背负着很多的责任感，但往往又很没有安全感，不会完全地相信别人。');
COMMIT;

-- ----------------------------
-- Table structure for schedule
-- ----------------------------
DROP TABLE IF EXISTS `schedule`;
CREATE TABLE `schedule` (
  `schedule_id` bigint NOT NULL,
  `schedule_name` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `start_date` datetime NOT NULL,
  `end_date` datetime NOT NULL,
  `user_id` bigint NOT NULL,
  `category_id` bigint NOT NULL,
  `open_remind` int DEFAULT (0),
  `status` int DEFAULT (0),
  `collect_count` int DEFAULT (0),
  `schedule_arrange` json DEFAULT NULL,
  `photos` json DEFAULT NULL,
  `remind_time` datetime DEFAULT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`schedule_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of schedule
-- ----------------------------
BEGIN;
INSERT INTO `schedule` (`schedule_id`, `schedule_name`, `start_date`, `end_date`, `user_id`, `category_id`, `open_remind`, `status`, `collect_count`, `schedule_arrange`, `photos`, `remind_time`, `create_time`, `update_time`) VALUES (1748661325674528769, '我的提醒', '2024-01-20 00:00:00', '2024-01-20 00:00:00', 1741794743807520770, 1, 1, 2, 1, '[{\"date\": \"2024-01-20\", \"content\": \"我\"}]', '[]', '2024-01-20 22:18:00', '2024-01-20 18:58:43', '2024-01-20 22:30:45');
INSERT INTO `schedule` (`schedule_id`, `schedule_name`, `start_date`, `end_date`, `user_id`, `category_id`, `open_remind`, `status`, `collect_count`, `schedule_arrange`, `photos`, `remind_time`, `create_time`, `update_time`) VALUES (1748662575069609985, '默默哦', '2024-01-20 00:00:00', '2024-01-20 00:00:00', 1741794743807520770, 1, 1, 2, 1, '[{\"date\": \"2024-01-20\", \"content\": \"emmmmmm\"}]', '[{\"url\": \"http://192.168.1.3:8080/uploads/0363b59a-b968-456d-94ba-df50762b3840.jpg\"}, {\"url\": \"http://192.168.1.3:8080/uploads/2b0e6a65-548d-4fe4-a2a2-525f42f37746.jpg\"}, {\"url\": \"http://192.168.1.3:8080/uploads/d40765f0-a85c-4d2e-b1f5-523f1374773b.jpg\"}, {\"url\": \"http://192.168.1.3:8080/uploads/899489ca-850e-470b-980b-e50eb7b17bbc.jpg\"}]', '2024-01-20 19:08:00', '2024-01-20 19:03:41', '2024-01-21 12:16:27');
COMMIT;

-- ----------------------------
-- Table structure for schedule_category
-- ----------------------------
DROP TABLE IF EXISTS `schedule_category`;
CREATE TABLE `schedule_category` (
  `category_id` bigint NOT NULL,
  `category_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of schedule_category
-- ----------------------------
BEGIN;
INSERT INTO `schedule_category` (`category_id`, `category_name`) VALUES (1, '学习');
INSERT INTO `schedule_category` (`category_id`, `category_name`) VALUES (2, '工作');
INSERT INTO `schedule_category` (`category_id`, `category_name`) VALUES (3, '生活');
INSERT INTO `schedule_category` (`category_id`, `category_name`) VALUES (4, '家务');
INSERT INTO `schedule_category` (`category_id`, `category_name`) VALUES (5, '旅游');
INSERT INTO `schedule_category` (`category_id`, `category_name`) VALUES (6, '大型活动');
INSERT INTO `schedule_category` (`category_id`, `category_name`) VALUES (7, '就医');
INSERT INTO `schedule_category` (`category_id`, `category_name`) VALUES (8, '其他');
COMMIT;

-- ----------------------------
-- Table structure for schedule_collect
-- ----------------------------
DROP TABLE IF EXISTS `schedule_collect`;
CREATE TABLE `schedule_collect` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `schedule_id` bigint NOT NULL,
  `user_id` bigint NOT NULL,
  `collect_status` bigint DEFAULT (0),
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1748709928434614275 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of schedule_collect
-- ----------------------------
BEGIN;
INSERT INTO `schedule_collect` (`id`, `schedule_id`, `user_id`, `collect_status`, `create_time`, `update_time`) VALUES (1747619900463755265, 1747614056296722433, 1741794743807520770, 1, '2024-01-17 22:00:28', '2024-01-17 22:00:31');
INSERT INTO `schedule_collect` (`id`, `schedule_id`, `user_id`, `collect_status`, `create_time`, `update_time`) VALUES (1747619930482388994, 1747619624684072961, 1741794743807520770, 1, '2024-01-17 22:00:35', '2024-01-17 22:00:35');
INSERT INTO `schedule_collect` (`id`, `schedule_id`, `user_id`, `collect_status`, `create_time`, `update_time`) VALUES (1748662992541270018, 1748662575069609985, 1741794743807520770, 1, '2024-01-20 19:05:21', '2024-01-20 19:05:21');
INSERT INTO `schedule_collect` (`id`, `schedule_id`, `user_id`, `collect_status`, `create_time`, `update_time`) VALUES (1748709928434614274, 1748661325674528769, 1741794743807520770, 1, '2024-01-20 22:11:51', '2024-01-20 22:11:51');
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` bigint NOT NULL,
  `nick_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `avatar_url` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `open_id` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` (`user_id`, `nick_name`, `avatar_url`, `open_id`, `create_time`, `update_time`) VALUES (1, '烈焰', '', '1', '2021-03-01 00:00:00', '2021-03-01 00:00:00');
INSERT INTO `user` (`user_id`, `nick_name`, `avatar_url`, `open_id`, `create_time`, `update_time`) VALUES (2, '不爱吃青菜', '', '2', '2022-02-01 00:00:00', '2022-02-01 00:00:00');
INSERT INTO `user` (`user_id`, `nick_name`, `avatar_url`, `open_id`, `create_time`, `update_time`) VALUES (3, '你的白日梦', '', '3', '2022-03-01 00:00:00', '2022-03-01 00:00:00');
INSERT INTO `user` (`user_id`, `nick_name`, `avatar_url`, `open_id`, `create_time`, `update_time`) VALUES (4, '风水轮流转', '', '4', '2022-04-01 00:00:00', '2022-04-01 00:00:00');
INSERT INTO `user` (`user_id`, `nick_name`, `avatar_url`, `open_id`, `create_time`, `update_time`) VALUES (5, '天涯璀璨泪', '', '5', '2022-05-01 00:00:00', '2022-05-01 00:00:00');
INSERT INTO `user` (`user_id`, `nick_name`, `avatar_url`, `open_id`, `create_time`, `update_time`) VALUES (6, '蝴蝶粉不过沧海', '', '6', '2022-06-01 00:00:00', '2022-06-01 00:00:00');
INSERT INTO `user` (`user_id`, `nick_name`, `avatar_url`, `open_id`, `create_time`, `update_time`) VALUES (7, '烈日', '', '7', '2022-07-01 00:00:00', '2022-07-01 00:00:00');
INSERT INTO `user` (`user_id`, `nick_name`, `avatar_url`, `open_id`, `create_time`, `update_time`) VALUES (8, '清风明月', '', '8', '2022-08-01 00:00:00', '2022-08-01 00:00:00');
INSERT INTO `user` (`user_id`, `nick_name`, `avatar_url`, `open_id`, `create_time`, `update_time`) VALUES (9, '把酒问青天', '', '9', '2022-09-01 00:00:00', '2022-09-01 00:00:00');
INSERT INTO `user` (`user_id`, `nick_name`, `avatar_url`, `open_id`, `create_time`, `update_time`) VALUES (10, '爱尔兰', '', '10', '2022-10-01 00:00:00', '2022-10-01 00:00:00');
INSERT INTO `user` (`user_id`, `nick_name`, `avatar_url`, `open_id`, `create_time`, `update_time`) VALUES (1741794743807520770, '晴天', 'http://192.168.1.3:8080/uploads/6b49cebe-a1e0-4786-a445-3ffca0781cc5.jpg', 'oS8yS4iFibbfi6h-PpzJBfRAlNY8', '2024-01-01 20:13:23', '2024-01-21 14:16:23');
COMMIT;

-- ----------------------------
-- Table structure for zodiac
-- ----------------------------
DROP TABLE IF EXISTS `zodiac`;
CREATE TABLE `zodiac` (
  `id` bigint NOT NULL,
  `name` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `icon` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `birth_range` varchar(250) COLLATE utf8mb4_unicode_ci NOT NULL,
  `wx` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `bmf` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `jxys` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `dxys` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `xysz` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `dxsz` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `xyh` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `jxfw` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ys` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `yd` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `qd` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `sy` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `aq` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `cf` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `jk` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `yp` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `yptz` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `yj` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `yjtz` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of zodiac
-- ----------------------------
BEGIN;
INSERT INTO `zodiac` (`id`, `name`, `icon`, `birth_range`, `wx`, `bmf`, `jxys`, `dxys`, `xysz`, `dxsz`, `xyh`, `jxfw`, `ys`, `yd`, `qd`, `sy`, `aq`, `cf`, `jk`, `yp`, `yptz`, `yj`, `yjtz`) VALUES (1, '鼠', NULL, '2032,2020,2008,1996,1984,1972,1960,1948,1936,1924,1912,1900', '子属水', '千手观音菩萨', '蓝、金、绿', '黄、啡色', '2、3', '5、9', '百合花,非洲紫罗兰,铃兰', '东南、东北方', '子年生人，为天贵星，性格非常聪明伶俐，凡事宜有心德，此人志愿颇高，利欲心很强，颇有成就，且有积蓄财富，一生多幸福，不过贵星太多，防欺人太甚，到时则会如命理所说：“四贵克子孙”，多与人和睦，到中年运到来风调雨顺，一切所谋遂意，到老年万事达到成功境界，此时得荣华富贵，若逢破星克命，虽富也不会吉也。\n		', '觉悟高反应快，开朗机智，识时务。\n		', '胆小固执，见利妄行，小气爱挑剔。	\n		', '将星带权，前景乐观。\n		', '消极放纵，桃色新闻多。\n		', '财星高照，财源茂盛。\n		', '小心饮食，关注肝脏健康。\n		', '龙、猴、牛', '大吉，心心相印，富贵幸福，万事易成功，享福终身。其他属相次之。', '马、兔、羊', '不能富家，灾害并至，凶煞重重，甚至骨肉分离，不得安宁。');
INSERT INTO `zodiac` (`id`, `name`, `icon`, `birth_range`, `wx`, `bmf`, `jxys`, `dxys`, `xysz`, `dxsz`, `xyh`, `jxfw`, `ys`, `yd`, `qd`, `sy`, `aq`, `cf`, `jk`, `yp`, `yptz`, `yj`, `yjtz`) VALUES (2, '牛', NULL, '2033,2021,2009,1997,1985,1973,1961,1949,1937,1925,1913,1901', '丑属土\n		', '虚空藏菩萨\n		', '蓝、红、紫色\n		', '白色、绿色\n		', '1、9', '3、4', '郁金香、万年青、桃花\n		', '东南方、正南方及正北方\n		', '丑年生人，性诚实，富有忍耐心，对事多固执，乏其交际，女人多信他人甜言以致失败，后悔不入及，应该谨慎之，此人沉默寡言，不被人重用，但内心温和，作事勤勉，活动独立，热心坚实，性向钱财等，早离乡白手成家，少年有福，中年交来多少苦劳与精神的麻烦与苦恼，晚景天禀赐福的荣幸，有婚姻上的麻烦等。\n		', '温厚老实，深思熟虑，有抱负。\n		', '拘谨冷漠，固执己见，不善沟通。\n		', '得心应手，大有可为。', '爱憎分明，风波曲折，中庸平衡。', '运势高涨，偏财小吉。\n		', '健康良好，关注耳鼻喉旧病复发。\n		', '鼠、蛇、鸡\n		', '大吉，天做良缘，家道大着阵，财盛家宁。\n		', '马、狗、羊\n		', '吉凶各有，甘苦共存，无进取心，内心多忧疑苦惨。');
INSERT INTO `zodiac` (`id`, `name`, `icon`, `birth_range`, `wx`, `bmf`, `jxys`, `dxys`, `xysz`, `dxsz`, `xyh`, `jxfw`, `ys`, `yd`, `qd`, `sy`, `aq`, `cf`, `jk`, `yp`, `yptz`, `yj`, `yjtz`) VALUES (3, '虎', NULL, '2034,2022,2010,\n		\n		1998,\n		\n		1986,\n		\n		1974,\n		\n		1962,\n		\n		1950,\n		\n		1938,\n		\n		1926,\n		\n		1914,\n		\n		1902\n		', '寅属木\n', '虚空藏菩萨\n', '蓝、灰、白、橙\n', '金、银、棕、黑\n', '1、3、4\n', '6、7、8', '富贵菊', '南方、东方及东南方\n', '寅年生人，外见宽容，内心刚强，好勇好誉之性，但为人慈悲心深，有舍己成仁之气慨，好出风头，有侠义之心，往往有不利名声的留在世间，宜要注意，此年生人平常好大不作小，宜要其信，自得受人尊敬，女人者多有智达、贞淑，虎年生人初年运至，中年运浮沉未定，变化多端，中年后暂得良好机会，晚景德高望众者亦有之。\n\n', '越挫越猛，雄心万丈，刚毅顽强。\n\n', '独来独往，极瑞叛逆，专横霸道。\n', '阻碍较多，提防年底低谷。\n', '好事多磨，易劳燕分飞。\n', '开源节流，不作大投资。', '抵抗力较差，小心个人健康。', '马、狗\n', '马、狗大吉, 配属猪的吉凶各半，同心永结，德高望重，家业终成，富贵荣华，子孙昌盛。\n\n', '蛇、猴\n', '夫妻不和，忧愁不断，无成功之望，有破财之兆，空虚寂寞。');
INSERT INTO `zodiac` (`id`, `name`, `icon`, `birth_range`, `wx`, `bmf`, `jxys`, `dxys`, `xysz`, `dxsz`, `xyh`, `jxfw`, `ys`, `yd`, `qd`, `sy`, `aq`, `cf`, `jk`, `yp`, `yptz`, `yj`, `yjtz`) VALUES (4, '兔', NULL, '2035,2023,2011,\n\n1999,\n\n1987,\n\n1975,\n\n1963,\n\n1951,\n\n1939,\n\n1927,\n\n1915,\n\n1903\n', '卯属木', '文殊菩萨\n\n', '红，粉红、紫，蓝\n', '深啡、深黄、白色\n', '3、4、9\n', '1、7、8\n', '兔子花、玉簪花、网纹草\n', '东、东南及南方\n', '卯年生人，性质温和而事业有妖娇，好静不宜好动，缺乏思虑决断，致使遗失了好机会，但富有背叛心而重友情，常浪费金钱，亦为事业上多情屡次失败，此人色情之念深致误招一生的不幸，宜应谨慎之，兔年生的人敏感，记忆力强，有慈悲心。守秩序，坚实、谦让、沉静孤立、审美福渐渐衰微之兆，所以前运应积俭，以待老年之用。\n\n', '越挫越猛，雄心万丈，刚毅顽强。\n\n', '独来独往，极瑞叛逆，专横霸道。\n', '阻碍较多，提防年底低谷。\n', '好事多磨，易劳燕分飞。\n', '开源节流，不作大投资。\n\n', '抵抗力较差，小心过劳现象。\n', '羊、猪、狗\n', '功业成就，安居乐业，专利兴家。\n', '鼠、龙\n', '家庭难有幸福，逆境之象，事业不成，灾祸之致，历尽痛苦。');
INSERT INTO `zodiac` (`id`, `name`, `icon`, `birth_range`, `wx`, `bmf`, `jxys`, `dxys`, `xysz`, `dxsz`, `xyh`, `jxfw`, `ys`, `yd`, `qd`, `sy`, `aq`, `cf`, `jk`, `yp`, `yptz`, `yj`, `yjtz`) VALUES (5, '龙', NULL, '2036,2024,2012,\n\n2000,\n\n1988,\n\n1976,\n\n1964,\n\n1952,\n\n1940,\n\n1928,\n\n1916,\n\n1904\n\n', '辰属土\n', '普贤菩萨\n', '金、银、灰白\n', '红、绿、紫、黑\n', '1、6、7\n', '3、8、9\n', '龙吐珠、采雀草\n', '西、西北及北方\n', '辰年生人，其性刚毅活泼之风气，嫌因循傲慢尊大，致与长上之意见不和，善恶断分之癖，故缺圆满交际，且性急乏妨耐与宽大心，作事偏激的反响失败者多。对此欠与矫正修得精术，技艺的意志者，自然得良焉。龙年生人多推论、思索、奋斗、意志强。权威，女子者嫌孤独、自信心强，不容易与他人相处，失去幸福前程，对共同事业难得持久力，少年运为固执、失败，中处恐陷入不正事端惹祸。\n', '心思细密，温柔体贴，心地仁厚。\n', '博爱，缺乏决断力，唯唯是诺。\n', '按部就班，创意多发展少。\n', '脆弱易骗，需带眼识人。\n', '一般，粗心易惹祸。\n', '易有小毛病，注意肠胃保养。\n', '鼠、猴、鸡\n', '大吉，缔结良缘，勤俭发家，日见昌盛，富贵成功，子孙继世。\n', '狗、兔\n', '不能和睦终世，破坏离别，不得心安。');
INSERT INTO `zodiac` (`id`, `name`, `icon`, `birth_range`, `wx`, `bmf`, `jxys`, `dxys`, `xysz`, `dxsz`, `xyh`, `jxfw`, `ys`, `yd`, `qd`, `sy`, `aq`, `cf`, `jk`, `yp`, `yptz`, `yj`, `yjtz`) VALUES (6, '蛇', NULL, '2037,2025,2013,\n\n2001,\n\n1989,\n\n1977,\n\n1965,\n\n1953,\n\n1941,\n\n1929,\n\n1917,\n\n1905\n', '巳属火\n', '普贤菩萨\n', '红、浅黄、黑\n', '白、金、啡色\n', '2、8、9\n', '1、6、7\n', '兰花、仙人掌\n', '东北、西南及南方\n', '巳年生人，其性稳和才智，好安排进退，甚喜交际。有高尚的品质，受朋友好评，但其内心常有阴毒与忌妒心，致难以保持永久交情，心情易造多疑之虑，而且好色，好与人争论而常失去好机会，对此宜应要慎戒之，蛇年生人带有勇敢、亲切，但女子善好家事，易怒短虑，好饮汤癖。少年运多受风霜之苦，中年运多受女色，晚年运渐渐养得幸福进来。\n\n', '精力充沛，热情慷慨，智慧过人。\n\n', '情绪不稳，傲慢自负，好大喜功。\n\n', '认真负责，运势平稳。\n', '顺畅无阻，提防第三者。\n', '一般，收支欠佳。\n\n', '切勿工作过度，注意饮食。\n', '牛、鸡\n', '大吉祥，此中属相相配为福禄鸳鸯，智勇双全，功业垂成，足立宝地，名利双收，一生幸福。\n', '虎、猪\n', '家境虽无大的困苦和失败，但夫妻离心离德，子息缺少，灾厄百端，晚景不祥。');
INSERT INTO `zodiac` (`id`, `name`, `icon`, `birth_range`, `wx`, `bmf`, `jxys`, `dxys`, `xysz`, `dxsz`, `xyh`, `jxfw`, `ys`, `yd`, `qd`, `sy`, `aq`, `cf`, `jk`, `yp`, `yptz`, `yj`, `yjtz`) VALUES (7, '马', NULL, '2038,2026,2014,\n\n2002,\n\n1990,\n\n1978,\n\n1966,\n\n1954,\n\n1942,\n\n1930,\n\n1918,\n\n1906\n\n\n', '午属火\n', '大势至菩萨\n', '啡、黄、紫\n', '蓝、白、金\n', '2、6、8\n', '1、6、7\n', '海芋、慈姑花、茉莉\n', '东北、西南及西北方\n', '午年生人，其性好动不好静，多喜出风头，而对社会交际极为巧妙，且多管他人事，备受人敬爱，并有贵人牵引以至成功，此人欲好外观，对内事缺乏观察，又好投机事业，且有怪癖之主张。致所思想及计划之事，难保其机密，此人有伶俐、敏速、为人亲切、好旅行、牺牲、自夸、焦燥、悲观的素质。\n\n', '冷静沈着，灵感丰富，思路敏锐。', '占有欲强，爱慕虚荣，情绪化。\n\n', '运势旺，商机多。\n', '有苦难言，起伏多变。\n', '应酬多，财运旺。', '无大碍，关注情绪和失眠小毛病。\n', '虎、羊、狗\n\n', '大吉，夫妻相敬，紫气东来，福乐安详，家道昌隆。\n\n\n', '鼠、牛\n\n', '中年运气尚可，病弱短寿，难望幸福，重生凶兆，一生辛苦，配偶早丧，子女别离。');
INSERT INTO `zodiac` (`id`, `name`, `icon`, `birth_range`, `wx`, `bmf`, `jxys`, `dxys`, `xysz`, `dxsz`, `xyh`, `jxfw`, `ys`, `yd`, `qd`, `sy`, `aq`, `cf`, `jk`, `yp`, `yptz`, `yj`, `yjtz`) VALUES (8, '羊', NULL, '2039,2027,2015,\n\n2003\n\n1991\n\n1979\n\n1967\n\n1955\n\n1943\n\n1931\n\n1919\n\n1907\n\n', '未属土\n', '大日如来\n\n', '绿、红、紫\n', '金、啡、黑色\n', '3、4、9\n', '6、7、8\n', '康乃馨、报春花、爱丽斯\n', '东、东南及南方\n', '未年生人，其性温柔，有孝心重礼仪，而对同性之人心甚强，多伶俐，好美观性，常常多舍已成仁，致劳苦困难事常有，此人思虑深沉，又有美术工艺趣味，多热心且向神佛、宗教的信念强，终身喜好居住闲静之处。\n\n', '浪漫热情，爽朗乐天，英雄主义。\n\n', '脾气暴燥，好面子虚荣，半途而废。\n', '克服贪心，必有不俗收效。\n', '顺其自然，不可强求。\n\n', '稳中见旺，可投资生意。\n', '身体颇佳，不可暴饮暴食。\n', '兔、马、猪\n', '大吉，天赐良缘，家道谐和，大业成而有德望。\n\n', '牛、狗\n', '夫妻一生难得幸福，多灾多难，一生劳碌，早失配偶或子孙。');
INSERT INTO `zodiac` (`id`, `name`, `icon`, `birth_range`, `wx`, `bmf`, `jxys`, `dxys`, `xysz`, `dxsz`, `xyh`, `jxfw`, `ys`, `yd`, `qd`, `sy`, `aq`, `cf`, `jk`, `yp`, `yptz`, `yj`, `yjtz`) VALUES (9, '猴', NULL, '2040,2028,2016,\n\n2004,\n\n1992,\n\n1980,\n\n1968,\n\n1956,\n\n1944,\n\n1932,\n\n1920,\n\n1908\n', '申属金\n', '大日如来\n', '白、金、蓝色\n', '红、黑、灰、深啡色\n', '1、7、8\n', '2、5、9\n', '菊花、葱花\n', '北、西北、及西方\n', '申年生人，其性多活泼、好动，伶俐，多才且灵巧，有竞争而敏捷的手腕，又有侠义的心肠，多为他人的事，放弃自己的事务，平常好说大话，不合自己的意见都即时反对且急癖，又带有虚言，诈伪的行为终为刑罚之苦的人有之，对此缺点矫正方可以成功发达。\n', '考虑周到，人际圆融，温柔大方。\n\n', '犹豫不决，阿谀奉承，听天由命。\n\n', '顺利而成功，防范祸起不测。\n\n', '心想事成，轻松自在。\n\n', '收支平稳，有偏财运。\n', '注意饮食卫生，外游不宜。\n\n', '鼠、龙\n', '功，子孙兴旺。\n', '虎、猪、蛇\n', '灾害多起，晚景尚可，但恐寿不到永，疾病困难。');
INSERT INTO `zodiac` (`id`, `name`, `icon`, `birth_range`, `wx`, `bmf`, `jxys`, `dxys`, `xysz`, `dxsz`, `xyh`, `jxfw`, `ys`, `yd`, `qd`, `sy`, `aq`, `cf`, `jk`, `yp`, `yptz`, `yj`, `yjtz`) VALUES (10, '鸡', NULL, '2041,2029,2017,\n\n2005,\n\n1993,\n\n1981,\n\n1969,\n\n1957,\n\n1945,\n\n1933,\n\n1921,\n\n1909\n', '酉属金\n', '不动尊菩萨\n', '金、啡、啡黄、黄\n', '绿、红、蓝、灰\n', '5、7、8\n', '1、3、9\n', '剑兰、凤仙花、鸡冠花\n\n', '西、西南、东北方\n', '酉年生人，其性诚实多智慧兼伶俐，能与人交际，望得贵人提拔，抱大志多计谋，终遂捷径光明，且有带快热冷的心理，致自抱自弃的缺点，对自己不利的时多与计较，致见少利而生大财之嫌。忠告：属鸡的人，远方男性女性都容易受异性引诱，恋爱的次数相当多，而且每一次都会付出真情，自尊心高，讨厌依赖别人，个性直率，所以并不是每种类型的人都合适你，因此在选择伴侣时，一定要三思而后行。\n\n', '活泼好动，见机行事，能言善道。\n', '狂妄自大，喜新厌旧，狡滑伪善。\n', '平稳顺利，亲力亲为必有成效。\n', '时好时差，时晴时阴。\n\n', '大幅增加，当心经济来往圈套。\n\n', '放松精神，减轻压力。\n', '牛、龙、蛇\n', '此中属相相配祥开白事，有天赐之福，并有名望，功利荣达，家事亨通。\n\n', '狗\n', '金鸡玉犬难逃避，合婚双份不可迁，多灾多难。');
INSERT INTO `zodiac` (`id`, `name`, `icon`, `birth_range`, `wx`, `bmf`, `jxys`, `dxys`, `xysz`, `dxsz`, `xyh`, `jxfw`, `ys`, `yd`, `qd`, `sy`, `aq`, `cf`, `jk`, `yp`, `yptz`, `yj`, `yjtz`) VALUES (11, '狗', NULL, '2042,2030,2018,\n\n2006,\n\n1994\n\n1982\n\n1970\n\n1958\n\n1946\n\n1934\n\n1922\n\n1910\n\n', '戌属土\n', '阿弥陀佛\n', '绿、红、紫色\n', '蓝、白、金色\n', '3、4、9\n', '1、6、7\n', '玫瑰花、文心兰、惠兰\n', '东、东南及南方\n', '戌年出生人，其性刚直，重义理与信义励业，此人有胆力、奋斗、活动性、聪明、直感性、机敏、大望、热情、费金钱，有稍暴燥性，女子者，富有引人之魅力，易多变自己必理，嫌虚荣、短气、苦劳性、不坚实、忍耐性，对此矫正自然获得良运遁来。\n\n', '勇敢风趣，机智多谋，热情专注。\n', '刻薄短视，心胸狭窄，傲慢自大。\n', '全力投入必会卓然增色。\n\n', '易有口角，忽略联系和关心。\n', '收入有突破，应把握分寸。\n', '小心交通意外，及水险、火灾。\n', '虎、兔、马\n', '大吉，天做之合，处处成功，福碌永久，家运昌隆。\n', '牛、龙、鸡\n', '灾害垒起，钱财散败，一生艰辛，事与愿违。');
INSERT INTO `zodiac` (`id`, `name`, `icon`, `birth_range`, `wx`, `bmf`, `jxys`, `dxys`, `xysz`, `dxsz`, `xyh`, `jxfw`, `ys`, `yd`, `qd`, `sy`, `aq`, `cf`, `jk`, `yp`, `yptz`, `yj`, `yjtz`) VALUES (12, '猪', NULL, '2043,2031,\n2019,\n\n2007,\n\n1995,\n\n1983,\n\n1971,\n\n1959,\n\n1947,\n\n1935,\n\n1923,\n\n1911\n\n\n', '亥属水\n', '阿弥陀佛\n', '黄、灰、啡、金\n', '红、绿、蓝\n', '2、5、8\n', '1、3、9\n', '绣球花、猪笼草、太阳菊\n', '西南、东北方\n', '亥年生人，其性耿直无弯曲，能向直中取，不可曲中求，心如洁白，无雅量，外观稳重，内心刚毅，好财，好批评他人是非，无忍耐性，依靠性强，不善交际。忠告：过地正直，非常讨厌拐弯抹角，所以在社会上容易与别人引起纠纷，也会被大家敬而远之。\n\n', '重情重义，纯朴正直，忠实可靠。\n', '易燥易怒，杞人忧天，倔强逞勇。\n', '力求谨慎和保守，有转运。\n', '镜花水月难以琢磨。\n', '不理想难积累，不可强求。\n', '多些休息及运动，慎防外游意外。\n', '羊、兔、虎\n', '大吉，五事其昌，安富尊荣，子孙健壮，积财多福。\n', '蛇、猴\n', '猪猴不到头，朝朝日日泪交流，不能共长久，终生难于幸福。');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
