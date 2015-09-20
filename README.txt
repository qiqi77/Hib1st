（一）需要部署的jar包：
1）hibernate3.jar
2）lib\required目录下的jar
3）lib\jpa\hibernate-jpa-2.0-api-1.0.1.Final.jar
4）Oracle数据库驱动jar包

（二）引入包
步骤：1）项目根目录创建lib文件夹：右击项目->new folder ，
2）直接复制粘贴。直接把包复制粘贴到lib目录；
3）把这些包导入工程：选中lib目录下的所有包全部选中->右键->选择 Build Path -> Add ...

更通用的做法：
把这些jar包放在一个文件夹中，保存在电脑磁盘中。假设该文件夹是lib。
1）Window->Preferences -> 左侧选Java -> 子菜单中的Build Path -> User Libraries，
选择New，命名，比如命名为hiblib，选Add External JARs，找到自己磁盘上的那个lib文件夹。
2）之后新建Java Project时就方便了。
New -> Java Project，
右击项目->Properties(或Alt+回车）->左侧Java Build Path ->右侧第三个选项卡Libraries -> Add Library
（添加库文件）->User Library ->选中自己刚才建好的那个，点击Finish。
这样就导入了。
但是它只是创建了包的引用。将来把工程拷贝走以后，这些jar文件不会在里面。
（我本地有这些东西，我告诉你在什么地方，你用的话可以去引用，但这些东西不会拷贝到你的工程里。||这会文件夹变小  ||另一台机器上必须得有同样的user library）

（三）创建配置文件