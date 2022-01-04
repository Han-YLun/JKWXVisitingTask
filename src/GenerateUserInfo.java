import java.util.Random;

public class GenerateUserInfo {

    //手机号码前两位
    private final static String[] PHONE_PREFIX = new String[]{"13", "15", "18"};

    //姓氏
    private final static String[] NAME_PREFIX = new String[]{"赵", "钱", "孙", "李", "周", "吴", "郑", "王", "冯", "陈", "楮", "卫", "蒋", "沈", "韩", "杨", "朱", "秦", "尤", "许", "何", "吕", "施", "张", "孔", "曹", "严", "华", "金", "魏", "陶", "姜", "戚", "谢", "邹", "喻", "柏", "水", "窦", "章", "云", "苏", "潘", "葛", "奚", "范", "彭", "郎", "滕", "殷", "罗", "毕", "郝", "邬", "安", "常", "乐", "于", "时", "傅", "皮", "卞", "齐", "康"};

    //称呼
    private final static String[] GENDER = new String[]{"男士", "女士"};

    //生成的数量
    private final static int NUMBER = 100;

    public static void main(String[] args) {

        for (int i = 0; i < NUMBER; i++) {

            //手机号码
            String phoneNum = PHONE_PREFIX[getRandomIndexBySize(PHONE_PREFIX.length)] + getNineRandomNumber();

            //姓名
            String name = NAME_PREFIX[getRandomIndexBySize(NAME_PREFIX.length)] + GENDER[getRandomIndexBySize(GENDER.length)];

            System.out.println("客户姓名 : " + name);
            System.out.println("联系方式 : " + phoneNum);
            System.out.println();
        }

    }

    /**
     * 根据大小生成[0,n)的数字
     *
     * @param size 最大的大小
     * @return 生成[0, n)的数字
     */
    public static int getRandomIndexBySize(int size) {
        return new Random().nextInt(size);
    }

    /**
     * 生成9位0-9的随机数
     *
     * @return 生成的9位0-9的随机数
     */
    public static String getNineRandomNumber() {
        StringBuilder sb = new StringBuilder(9);
        for (int i = 0; i < 9; i++) {
            sb.append(new Random().nextInt(10));
        }
        return sb.toString();
    }

}
