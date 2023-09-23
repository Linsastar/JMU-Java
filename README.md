# JMU-Java
集美大学Java作业自存
# 实验1

实验目的：掌握JDK安装与配置，掌握Java IDE开发环境配置与基本使用。

实验要求：独立完成实验操作，并撰写实验报告（实验报告模板见附件）。

实验内容：

1. intellij idea安装与使用

(1)安装intellij idea(如果已经安装了，实验报告中可不必添加安装过程的截图)；

(2)新建一个Java Project；

(3)编写HelloWorld.java；

(4)运行HelloWorld，在intellij idea控制台中查看结果。

注意：观察intellij idea开发环境中对编译错误的提示，并适当修改。

说明：也可以使用eclipse等其他IDE环境。

2. JDK的配置与HelloWorld

(1)学会设置环境变量JAVA_HOME、classpath与path(参考课件)；

(2)学会使用java –version查看版本号，确认jre是否装好；

(3)学会使用记事本编写HelloWorld.java；

(4)使用命令行(cmd)行进行编译(javac)、运行(java)。

注意：编译或者运行时碰到错误，可以在baidu中搜索相应解决方案。

3. 筛法求素数

编写一个程序，从键盘读取正整数n，使用筛法求不大于n的所有素数（或称质数，Prime Number），并逐个打印出来。输出结果为：

n=10

The prime numbers are 2,3,5,7

附注：筛法是一种简单检索素数的算法。据说是古希腊的埃拉托斯特尼（Eratosthenes，约公元前274～194年）发明的，又称埃拉托斯特尼筛法（sieve of Eratosthenes）。具体做法是：给出要筛数值的范围n，先用2去筛，即把2留下，把2的倍数剔除掉；再用下一个素数，也就是3筛，把3留下，把3的倍数剔除掉；接下去用下一个素数5筛，把5留下，把5的倍数剔除掉；不断重复下去……

注意：处理控制台输入，请参考课件中相关内容（使用Scanner的nextLine()或nextInt()）；可以学习查询jdk文档，Integer类的parseInt方法，将字符串转换成int型。

(1)编写函数

编写public static void printPrimeNumbers(int[] n)方法，将不大于n的每个素数输出；

编写public static int[] getPrimeNumbers(int n)方法，将每个不大于n的素数放入数组，并返回。方法原型定义参考如下（逻辑代码需要自行填充！方法签名不能修改，但代码不限定）：

public static int[] getPrimeNumbers(int n){

int[] result = new int[n];

//一系列处理代码

return result;

}

(2)编写测试代码

在main方法中输入n，调用getPrimeNumbers方法获取素数数组，再调用printPrimeNumbers方法输出这些素数。

*(3)思考

当n比较大时（如100,000,000），分析算法的瓶颈，并给出改进的策略！

4. 最大公约数

分别使用递归和非递归的算法，求解两个数的最大公约数。

说明：辗转相除法，又名欧几里德算法（Euclidean Algorithm），是求最大公约数的一种方法。具体做法是：用较小数除较大数，再用出现的余数（第一余数）去除除数，再用出现的余数（第二余数）去除第一余数，如此反复，直到最后余数是0为止。如果是求两个数的最大公约数，那么最后的除数就是这两个数的最大公约数。

提示：编写静态方法private static int gcd(int m, int n)用于实现非递归算法，编写private static int gcd_recursive(int m, int n)用于实现递归算法。主程序提供输入，并分别调用这两个方法测试。

5. 求e的近似值

自然对数底数e是一个超越数，是一个无限不循环小数，它的值约为2.718281828459…。数学上，e定义为(1+1/n)n的极限(n趋于无穷大）。此外，e也可以定义为：1/0!+1/1!+1/2!+…+1/n!+…，更适合计算机迭代算法。

要求：使用迭代法，且误差控制在10-6以内。


# 实验2


实验目的：熟悉Java常用类用法；复习与掌握基本控制结构。

实验要求：独立完成实验操作，并撰写实验报告（实验报告模板见附件）。

实验内容：

1.使用Math类产生随机数

使用随机数完成如下各小题：

(1)构造拥有n个元素的数组（n由键盘输入），往数组中随机填入1000-2000之间的整数，然后统计并输出其中大于1500与小于等于1500的百分比。（注意：可以使用for each循环进行统计，随机数用法见参考资料）

(2)随机生成n个（n由键盘输入）a-z的字符（26个字符），统计输出每个字符所占总生成字符的百分比。

(3)附件String.txt是java.lang.String的JDK API文档，读取该文件，统计字符a-z出现的频率（百分比）。统计时仅统计字符a-z、A-Z，不分大小写，其余字符忽略。文件读取方法参考附件WriteReadFileTest.java。

随机数参考资料：

(1)Math.random();//输出[0,1)的双精度随机数

(2)(int)(Math.random() * 10);//产生0到9之间的整数

(3)1 + (int)(Math.random() * 10);//产生[1,10]之间的整数

(4)(int)(3 + Math.random()*(17 - 3 + 1));//产生3到17之间的随机整数

(5)(char)('a' + Math.random() * ('z' - 'a' + 1)));//产生从a到z的随机字符

注意：如果要产生一系列的随机数，请使用java.util.Random类，查询jdk文档。

2. String对象的创建、截取和拼接

编写一函数public static String getBirthDate(String id)，以YYYY-MM-DD抽取出给定id(身份证号码)的出生年月日信息，如:

String id = "350102199902131018";

String result = getBirthDate(id);

result的值应为1999-02-13

进一步的，如给定若干身份证号(放到一数组中)，抽取这些身份证号的出生年月日信息，并按从小到大的顺序或者从大到小的顺序排列输出抽取出的出生年月日。

思考：如果是对整个身份证号码，按照出生年月进行排序，如何实现？

提示：可直接使用Arrays类的sort(Object[] a)方法进行排序，无需自己编写排序算法。请同学们学会查询jdk文档。

3. 使用Scanner类进行文件输入输出与字符串的处理

编写一个程序，实现从文件中读出学生信息，统计平均分、总分，并写入文件。

(1)阅读附件WriteReadFileTest.java关于文件读写的源代码。

(2)随机生成10000个学生及三门科目的分数，然后写入指定文件名的文件。文件格式如下（字段间的分隔符建议使用空格，简化输入输出，缺点是字段内不能含有空格）：

Name Math Java DS Average Total

张三 90 95 98 0 0

李四 80 90 100 0 0

……

其中，姓名字段不需要随机生成，直接使用“张三xx”等即可；平均分(Average)与总分(Total)字段在随机生成时给0即可，后续再统计填充。

(3)从文件中读出学生信息，统计平均分、总分，并写入文件。比如，原学生信息为 "张三 90 91 92 0 0"，处理后的结果为"张三 90 91 92 91 273"，这里仅使用整型运算即可，不需要用浮点数。

(4)找出平均成绩前10名的学生，写入“first_10.txt”文件。

(5)编写一个查找学生的方法，public static String[] findStudent(String name)。根据传入的name在文件中查找姓名相同的学生，并以数组的形式返回。

4. 八皇后问题

该问题是国际西洋棋棋手马克斯·贝瑟尔于1848年提出：在8×8格的国际象棋上摆放八个皇后，使其不能互相攻击，即任意两个皇后都不能处于同一行、同一列或同一斜线上，问有多少种摆法。

(1)使用回溯算法，找出一组解，并打印输出。

(2)在(1)的基础上，遍历所有可能解，打印并统计解的个数。

(3)(选做)扩展为n皇后问题，其中n由控制台输入，求其所有可能解(或无解时提示)，打印并统计。


# 实验3

实验目的：掌握类的定义，构造方法，初始化；理解类与对象，并能够加以区分。

实验要求：独立完成实验操作，并撰写实验报告（实验报告模板见附件）。

实验内容：

1.Person类的定义与使用

(1)定义一个有关人的Person类，内含姓名name、性别sex、年龄age属性，所有的变量必须是私有的(private)。

(2)设计一无参构造函数初始化Person的age属性为0、sex属性为0(或者其他，视定义的数据类型而定)、name属性为空字符串("")。

(3)使用这些构造方法对Person类进行初始化。

(4)其他类只能通过该类的setter、getter方法修改与获取属性。

(5)改写toString()方法，显示其所有属性。另外定义测试类TestPerson，对Person类进行测试。

思考：private修饰的属性，访问起来到底有何限制？如果Person p = new Person();可以直接使用p.name访问p的name属性吗？

2. 类的简单使用

定义一个类NarcissisticNumber，其中有一个非静态方法public boolean isNarcissisticNumber(int num)，用于判断num是否为水仙花数（返回true表示“是”，返回false表示“不是”）。

水仙花数（Narcissistic Number）也被称为超完全数字不变数（pluperfect digital invariant, PPDI）、自恋数、自幂数、阿姆斯壮数或阿姆斯特朗数（Armstrong number），是指一个 3 位数，它的每个位上的数字的 3 次幂之和等于它本身。例如：1^3 + 5^3+ 3^3 = 153。

编写测试类，在程序主入口main()方法中创建一个NarcissisticNumber对象，调用isNarcissisticNumber方法并输出（测试数据自定，也可以由键盘输入）。

思考：静态方法与非静态方法使用起来有什么区别？

3. 长方体与球体

(1)编写长方体类Cuboid、球体类Spheroid、圆锥体类Cone，各有各的属性。

(2)在三个类中分别定义求表面积的方法public double getSurfaceArea()、求体积的方法getVolume()。

(3)新建测试类TestGeometry，针对每个类建立两个对象(共六个对象，成员值自定或随机)，并将这些对象的所有表面积与体积分别相加统计输出。

思考：对表面积、体积进行相加统计的代码是否过于复杂？有无改进空间？

4. 初始化块

(1)为题1中的Person类添加两个属性：身份证号int id(不要求与真正的身份证类似，不要使用随机数生成；这里的id只是一个简单的整型值，每个Person对象均不同即可。如，可以从1开始编号，第一个Person对象的id为1，第二个为2，以此类推)，静态变量(类变量)static int count(用于记录身份证号自动增长的历史)。

(2)在构造方法中对id进行初始化，并使得每个生成对象的id均不同。

(3)为Person类创建两个构造方法：第一个为包含两个参数的构造方法，可根据提供的“name”、“age”参数，对姓名、年龄属性进行初始化；第二个构造函数包含三个参数name,age,sex，使用构造方法重载技术，调用第一个构造方法，并额外对sex属性进行初始化。

(4)覆盖Person类中的toString方法，输出Person的基本信息。选择适当的测试语句，测试本题中的改动。

5. 二次方程式求解

为二次方程ax2+bx+c=0设计一个名为QuadraticEquation的类。这个类包括：

(1)代表三个系数的私有数据成员a,b和c；

(2)一个参数为a,b,c的构造方法；

(3)一个名为getDiscriminant()的方法，返回判别式：b2-4ac；

(4)名为getRoot1()和getRoot2()的方法，返回二次方程的两个根：r1=(-b+(b2-4ac)1/2)/2a，r2=(-b-(b2-4ac)1/2)/2a。这两个方法只有在判别式为非负数时才有用。如果判别式为负，则返回0。

实现这个类。编写一个测试程序，提示用户输入a,b和c的值，然后显示判别式的值。如果判别式为正数，显示两个根；如果判别式为0，则显示一个根，否则显示"The equation has no roots."字样。

6. 矩阵四则运算

定义矩阵类Matrix，包括：

(1)代表矩阵的行数rows(或m)、列数cols(或n)，以及二维数组data；

(2)一个参数为rows,cols的构造方法，实现初始化操作，并将矩阵元素全部置为0；

(3)public void setElement(int row, int col, double value);方法，用于设置第row行，第col列元素的值；

(4)public Matrix add(Matrix m);方法，实现当前矩阵与m矩阵相加，并返回新的矩阵；若无法相加，则返回null；

(5)public Matrix minus(Matrix m);方法，实现当前矩阵减去m矩阵，并返回新的矩阵；若无法相减，则返回null；

(6)public Matrix multiple(Matrix m);方法，实现当前矩阵乘以m矩阵，并返回新的矩阵；若无法相乘，则返回null；

(7)public Matrix transposition();方法，实现矩阵转置，并返回新的矩阵；

(8)public void display();方法，打印当前矩阵。

实现该类。编写一个测试程序，随机生成矩阵元素或者由程序中用常量设置（可不必由键盘输入），测试上述四则运算，打印运算结果。

注意：要认真考虑矩阵类的封装性与完备性，同时要注意“封装”与“组装”的规范。

7. 学生成绩管理

实验2中WriteReadFileTest.java中实现了对学生的信息存储与读取，但不是采用面向对象的编程方法。现在要求通过采用面向对象的方法改造该程序。

(1)创建Student类，包含name,math,java,ds,avg,total等属性(其中，avg和total成员可以写，也可以省略，具体看程序中如何处理)，并编写器setter/getter方法（注意相应的avg与total的getter/setter方法的编写）。并编写两个构造函数，一个构造函数包含除avg,total外的所有属性，另一个构造函数包含所有属性。编写相应的toString()方法。

(2)创建一Students.txt文件，文件格式如下：

张三 90 95 98 0 0

李四 80 90 100 0 0

(3)使用上一次的编写的public static String[] readStudentsFromFile(String fileName)，把文件中的信息读取到String数组中。

(4)编写public static Student[] makeStudentFromString(String[] students)，实现将字符串转化成学生对象。

(5)编写一个方法对返回的Student数组中的所有学生的平均成绩进行排序，并输出。

提示：(3)(4)可以合并，方法签名改为：public static Student[] readStudentsFromFile(String fileName)。


# 实验4
实验目的：熟悉类的继承；掌握多态性编程；了解反射机制。

实验要求：独立完成实验，并撰写实验报告。

实验内容：

1. 抽象类Geometry与泛型数组列表

(1)编写一抽象类(Geometry)，有一个PI属性(final static)用于存放圆周率、用于求表面积的抽象方法public double getSurfaceArea();和用于求体积的抽象方法public double getVolume();。

(2)长方体类Cuboid、球体类Spheroid、圆锥体类Cone均为其子类，并各有各的属性，并均有获得其表面积、体积的方法。还需要生成相应的setter/getter方法。

(3)在一测试类中，分别建立若干个子对象（对象类型自定，尽量用到所定义的类），并放入数组或者ArrayList中，然后将各种形状的对象的所有表面积与体积分别累加输出。与实验3第3小题相比，哪种更方便？

(4)针对上面的各子类编写相应的equals,hashCode,toString(可自动生成，但需看懂代码，注意里面对double类型属性是如何进行比较的)。

注意：所有的代码都应该放在合适的包中（包名自定）。

思考：为什么PI属性要使用final进行修饰？

2. Staff, Teacher, SecurityGuard, Dean

(1)定义Staff类(职工)，添加如下属性(name, address, age, sex, salary, dateHired)，类型自定，其中salary为工资，dateHired为雇佣日期(java.util.Date类型)。生成相应的setter/getter方法。

(2)编写Teacher类(教师)，继承自Staff类，包含属性：department(系), speciality(专业), postAllowance(岗位津贴)。

(3)编写SecurityGuard类(保安)，继承自Staff类，包含属性：skills(专技), dangerousAllowance(高危津贴)。

(4)编写Teacher的一个子类Dean(院长)，包含属性：adminAward(行政奖金)。

(5)定义上述各类的getter/setter方法，并添加合适的构造方法。

(6)编写一个测试类，在测试类中添加若干个Staff, Teacher, SecurityGuard, Dean实例(个数及内容自定)，并在测试类中定义并测试如下方法：①编写一个方法private static void printName(Staff[] persons)打印出每个人的名字；②编写一个方法private static void printSalary(Staff[] staffs)打印出Staff类或者其子类对象的薪水(注意：Staff的薪水只有salary，Teacher的薪水为salary+postAllowance，SecurityGuard的薪水为salary+dangerousAllowance，而Dean的薪水则为salary+postAllowance+adminAward)；③编写一方法private static void sortBySalary(Staff[] staffs)，支持对Staff类及其子类按照各自的薪水降序排序；④编写一方法private static void sortByAge(Staff[] staffs)，对Staff对象按照年龄升序排序，再编写一个方法按name升序进行排序；⑤(选做)编写一方法sortByDateHired，支持对Staff类及其子类按照各自的dateHired升序排序，可以使用java.util.Date类的getTime方法。

说明：排序暂时不要使用比较器（Comparable、Comparator等）！

3. Account, CheckingAccount, SavingAccount

(1)定义Account类，模拟一个银行帐户，包括帐户名、余额、年利率、开户日期等成员。同时Account类拥有存款(deposit)和取款(withdraw)两个方法，方法参数及返回值自定，但要综合考虑后续测试类中的调用规范。

(2)创建Account类的两个子类：支票帐户(CheckingAccount)、储蓄帐户(SavingAccount)。其中支票帐户有一个透支限定额，但储蓄帐户不能透支。

(3)编写测试程序，创建若干Account、CheckingAccount、SavingAccount，打印帐号信息，同时测试存款、取款方法。

提示：这里要注意“取款”方法的设计，在逻辑上，支票帐户允许一定额度的透支，而普通帐户和储蓄帐户不能透支。可以合理使用覆盖设计该方法。

4. 枚举类型

编写枚举类型CurrencyUnit，表示货币单位，定义若干常量(如美元、英镑、欧元、人民币、日元等)，每个CurrencyUnit常量都包含一个中文的描述信息(即需要一个带一个参数的构造方法)。

编写枚举类型Country，表示国家，定义若干常量(如美国、英国、中国、法国、日本等)，每个Country常量包含两个信息：中文描述及所使用的货币单位(CurrencyUnit类型)。

编写简单的测试类，使用上述枚举类型赋值及输出。

# 实验5
实验目的：掌握接口的定义与实现；熟悉内部类机制；能够使用Comparable、Comparator接口；会使用简单的Lambda表达式。

实验要求：独立完成实验，并撰写实验报告。

实验内容：

1. Geometry与Comparable接口

改写实验4中的抽象类Geometry，让其实现Comparable接口，实现对表面积的排序；在测试类中创建Geometry类型的数组或动态数组，里面有若干个Cuboid、Spheroid和Cone对象，然后利用Arrays.sort或Collections.sort对该Geometry数组或动态数组进行排序；输出排序后Geometry数组。

注意：所有的代码都应该放在合适的包中（包名自定）。

2. Staff与Comparator接口

(1)针对实验4编写的Staff类，分别编写NameComparator，AgeComparator和ComplexComparator比较器。其中ComplexComparator为复合比较器，至少选用两个关键字来排序，关键字选择、次序及升降序均由同学们自行设计。

(2)编写一个测试类，在测试类中添加若干个Staff, Teacher, SecurityGuard, Dean实例(个数及内容自定)，并在测试类中定义并测试如下方法：①编写一个方法private static void printName(Staff[] staffs)打印出每个人的名字；②编写一个方法private static void printSalary(Staff[] staffs)打印出Staff类或者其子类对象的薪水(注意：Staff的薪水只有salary，Teacher的薪水为salary+postAllowance，SecurityGuard的薪水为salary+dangerousAllowance，而Dean的薪水则为salary+postAllowance+adminAward)；③编写一方法private static void sortBySalary(Staff[] staffs)，支持对Staff类及其子类按照各自的薪水降序排序；④编写一方法private static void sortByAge(Staff[] staffs)，对Staff对象按照年龄升序排序，再编写一个方法按name升序进行排序；⑤编写一方法sortByDateHired，支持对Staff类及其子类按照各自的dateHired升序排序，可以使用java.util.Date类的getTime方法。

3. Lambda表达式

使用Lambda表达式简化上述“Staff与Comparator接口”题目中的NameComparator，AgeComparator和ComplexComparator比较器。测试方法与上述相同。

# 实验6
实验目的：掌握图形程序设计；掌握Swing组件；掌握事件处理。

实验要求：独立完成实验，并撰写实验报告。仍然要注意代码的规范性！

实验内容：

1. 图形程序设计

(1)编写一个用于绘图的DrawLineComponent extends JComponent。覆盖其paintComponent方法，进行图形的绘制。该组件可以根据给定的点(Point2D)的集合，绘制出对应的曲线（相邻的两点构成线段，曲线实际上是折线）。

(2)使用上述的DrawLineComponet，分别绘制正弦曲线、余弦曲线或者画出自己编写表达式(如y=kx、y=sinx+cosx、y=e-x等)的曲线。

说明：图形可以看作是线的组合，线则是点的组合，只要构造出点的集合，就可以构造出对应的线，进而画出整个图形。

进阶1：如果还想通过上面的程序画其他曲线？如何进行？试编写一个通用的绘图程序。

进阶2：如果想在绘制曲线的同时，绘制坐标轴，或者同时绘制多条曲线而不互相干扰，上述的DrawLineComponent能不能实现？如果能，请写出一个示例；如果不能，请改造它，并写出一个示例。

2. Swing用户界面组件

(1)实现一个登录界面，需要对输入的用户名和密码进行验证；所有有效用户名列表和其所对应的密码，可以暂时存在某个数组或者集合中。学有余力的同学可以考虑添加一个验证码(一般是一串随机字符和数字的图片，可加干扰线)的校验。

(2)当登录失败的时候，弹出一个对话框，显示一个密码输入错误或者用户名不存的对话框。

(3)登录成功的时候，显示主界面。主界面有一个"项目"的菜单(menu)，该菜单有3个菜单项(menuitem)，分别是曲线演示、打开文件、退出。

(4)在“曲线演示”主界面中可以根据选择(利用组合框选择正弦、余弦、自编曲线)，绘制出相应的图形(图形绘制组件使用第1题的程序)。

3. 事件处理

(1)实现对第1小题绘制出来的正弦曲线使用鼠标右键拖动(即平移，整个曲线随鼠标移动而移动)。

(2)使用鼠标左键拖拽曲线上的某个点以改变曲线的图形。

4. 画笔程序

实现简单的鼠标画笔功能（仅实现鼠标拖动画线功能即可），参考Windows的“画图”程序。

思路：

(1)需要有一个集合专门存储鼠标按下时产生的点的坐标，但要注意：只能存储一条连续的曲线，鼠标松开时这个List就不再存储接下来的点。

(2)不同的连续曲线存储在不同的集合，所以可能有多个集合。

(3)每次移动鼠标时，要重绘所有集合中所有的点。

(4)关闭程序时保存内存中所有List中的所有点(可使用文件)。

进阶(选做)：学有余力的同学，可以尝试扩充功能，如线条颜色、常见几何图形(矩形、椭圆等)，并使这些图形绘制后仍然可以选择并移动。

# 实验7
实验目的：掌握常用异常的处理方法；掌握常用集合的基本用法；理解泛型及其应用。

实验要求：独立完成实验，并撰写实验报告。

实验内容：

1. 使用异常机制处理程序错误

为下面的代码加入适当的异常处理, 使得该程序可以处理输入的字符串不为数字字符串的情况（要求重新输入，最后得到3个从键盘输入的浮点数）。

public static void main(String[] args) {
double[] x = new double[3];double sum = 0.0;

Scanner inputScan = new Scanner(System.in);

for(int i = 0; i < x.length;i++){

System.out.println("Please input the "+(i+1)+" number:");

String input = inputScan.nextLine();

x[i] = Double.parseDouble(input);

sum += x[i];

}

System.out.println(Arrays.toString(x));

System.out.println("Sum:" + sum);
}

2. List与Iterator接口

(1)编写NameDao接口，包含如下方法：

//将数组中的字符串放入列表，该方法需要使用ListIterator接口实现添加

public List getNameFromArray(String[] names);

//在列表中搜索到与name相同的项目，就返回该name所在的序号，找不到返回-1。

public int searchName(List nameList, String name);

//根据指定id，从列表中移除指定的项目，如果id指定错误(负数或者超出列表最大值)抛出IllegalArgumentException异常，移除成功返回true

public boolean removeFromList(List nameList, int id);

(2)编写NameDaoImpl实现NameDao接口。

(3)编写一个测试类，测试上述代码的功能。

3. Map与HashMap

(1)编写Student类，只有String name与int age两个属性和他们的setter/getter方法，覆盖其hashCode与equals方法。

(2)在Util类中编写方法：List getRandomStudents(int n)随机生成n个学生的列表。

说明：调用“基础代码”中的Util.getRandomName (int min, int max)获取随机名字，调用public static int getRandomAge(int min, int max)生成随机年龄。

(3)在Util类中编写方法：public static Map makeStudentMap(List);，将List中每个Student的name作为key, Student对象本身作为value放入Map中，并返回。

(4)在Util类中编写方法：public static String searchName(List nameList, String name);，根据指定的name返回相应的字符串，如果没有找到返回null。

(5)在Util类中编写方法：public static Student searchStudent(Map stuMap, String name);，根据指定的name返回对应的学生，如果没有找到返回null。

(6)在Util类中编写方法：public static List generateNameList(int n);，生成n个字符串的NameList并返回。

(7)在Util类中编写方法：Map generateStudentMap(int n);，生成包含n个键的的StudentMap并返回。

说明：调用getRandomStudents方法；调用makeStudentMap方法；返回StudentMap。

(8)对比测试。在初始化阶段调用generateNameList方法生成nameList列表，里边包含1000万个字符串。在初始化阶段调用getRandomStudents生成1000万个Student对象，然后调用makeStudentMap方法生成stuMap映射表。

对nameList调用searchName方法搜索指定字符串并统计执行时间。

对stuMap调用searchStudent方法搜索指定字符串对应的学生对象并统计执行时间。

思考：步骤(8)中，哪个方法搜索速度快？为什么？

(9)遍历输出StudentMap前10个的key，前10个value，前10个entry。

备注：可以设置虚拟机选项，让JVM能够拥有大内存。

★Eclipse中的设置方法：打开Window->Preferences菜单，左边列选择Java->Installed JREs，在需要设置的JRE上，点击Edit，设置Default VM arguments的值为“-Xms1024m -Xmx4096m”，其中-Xms设置最小内存，-Xmx设置最大内存。

★IDEA中的设置方法：选择Help->Edit Custom VM Options，修改-Xms和-Xmx为相应的内存值，如-Xms1024m、-Xmx4096m。

4. Collections

(1)改写Student类，增加int grade属性。

(2)随机生成100个Student对象放入students数组。

(3)将students数组转换成studentList(List类型)。

(4)使用Collections.sort对student的成绩进行排序。

(5)使用Collections的min和max方法找到成绩最高的和成绩最低学生。

(6)使用Collections的binarySearch查找成绩等于60的学生。

(7)编写方法从studentList找出grade小于60的学生，放入otherList。

(8)使用List的removeAll方法，从studentList中移除otherList。

(9)使用Collections的shuffle方法，打乱studentList中学生排列的顺序。

(10)将studentList转换为数组。

# 实验8
实验目的：掌握线程的创建与启动；了解线程同步与互斥。

实验要求：独立完成实验，并撰写实验报告。

实验内容：

1. 线程的创建与启动

QQ文件传输支持多线程，可以在接收文件的同时进行文件发送。不考虑同一个文件多线程收发的问题，编写ReceiveFileRunnable与SendFileRunnable类（两个类都具有构造方法，带一个String参数，传入收发的文件名），均实现Runnable接口。这两个类的run()方法分别有如下功能：

(1)分别打印"I am receiving file:xxx.x" 和"I am sending file:yyy.y"，表示开始收发文件；其中，"xxx.x"和"yyy.y"为收发的文件名；

(2)休眠3000ms-6000ms间的随机时间(Thread.sleep..)；分别打印"File:xxx.x has been received."和"File:yyy.y has been sent."，表示收发结束。

编写TestThread类，在main方法中启动5个ReceiveFileRunnable与5个SendFileRunnable线程。当这5个ReceiveFileRunnable与5个SendFileRunnable线程结束，才执行最后一句代码，打印"QQ文件收发任务结束"(使用join)。

2. 并发计算模拟

计算从1到1亿整型数相加。要求使用并发程序处理，即采用多线程实现，在主线程中将计算结果累加(不能使用累加公式)。

大致思路：

(1)编写SumWorker类，实现Runnable接口，计算从m到n的和，其中m,n由构造方法传入；

(2)在主程序中每次开启若干个SumWorker线程(具体数量由程序指定或者用户输入)，计算完成之后，将部分结果累加，然后再启动另一批线程，直到计算完成。

说明：本题有点类似“网格计算”或者“云计算”。

扩展（选做）：学有余力的同学可以尝试研究参数对并行性能的影响，如：同时并发线程数、每线程计算数量、共享式sum与独立式sum等，并尝试分析其原因。

3. 哲学家就餐问题

哲学家就餐问题是1965年由Dijkstra提出的一种线程同步的问题。

一圆桌前坐着5位哲学家，两个人中间有一只筷子，桌子中央有面条。哲学家思考问题，当饿了的时候拿起左右两只筷子吃饭，必须拿到两只筷子才能吃饭。上述问题会产生死锁的情况，当5个哲学家都拿起自己右手边的筷子，准备拿左手边的筷子时产生死锁现象。

请尝试使用多线程模拟，确保不会出现“饿死”状态。

说明：本题有很多解法，但优先使用wait/notify模型。

# 实验9
实验目的：理解流与文件的区别与联系；掌握各种流操作方法。

实验要求：独立完成实验，并撰写实验报告。

实验内容：

1. 字节流、过滤流、字符流、对象流

将Student对象(属性：int id, String name(不多于10个字符),int age,double grade)写入文件、读出文件，分别尝试使用以下方式实现：

(1)DataInputStream, DataOutputStream；

(2)Scanner(或BufferedReader), PrintWriter；

(3)ObjectInputStream, ObjectOutputStream。

问题：1、2、3方法生成的文件大小各是多少？尝试分析1和2输出的文件大小。

要求：以方法的形式进行封装（使用方法重载），例如：

public static void writeStudent(Student s, DataOutputStream dos){};

或者：public static void writeStudent(List stus, DataOutputStream dos){};


读取时类似：

public static Student readStudent(DataInputStream dis){};

或者：public static List readStudent(DataInputStream dis){};


其他类型的流也相应修改。

2. 二进制文件查看器

模仿UltraEdit/EditPlus二进制文件编辑模式，编写一个简单的二进制文件查看器（控制台输出即可），参考附件EditPlus_Hex.png图片。

其中，左边为当前行的首地址（十六进制表示），中间是每行16个字节的16进制字符，每字节间用一个空格分隔，8个字节之后用两个字节分隔，右边为这16字节的ASCII码表示（非可打印字符使用点号或其他符号代替）。不足16字节的行，仍然要保持这三部分的对齐。

要求：实现基本的二进制查看即可，编辑不作要求。

3. 文件检索

编写一个程序，从控制台输入要检索的文件（支持通配符）和起始检索目录（如：D:\），递归查找该目录及其所有子孙目录中查找符合条件的文件，打印输出文件的全路径。检索完成后，显示检索到的文件数量。

提示：使用File类，查jdk文档File类的方法。可以使用递归也可以不使用递归。

说明：也可以使用GUI界面完成输入与结果展示。
