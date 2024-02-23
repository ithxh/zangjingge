# JVM(JAVA Virtual Machine)

> java 虚拟机 ：本质上是一个运行在计算机上的程序，运行Java字节码文件

##### 功能

- 解释和运行：对字节码文件中的指令，实时的解释成机器码，让计算机执行
- 内存管理：1.自动为对象，方法等分配内存 2.自动的垃圾回收机制，回收不再使用的对象。
- 即时编译：对热点代码进行优化，提升执行效率

###### 即时编译

- java语言如果不做优化，性能不如C , C++
- ![image-20240208142611524](E:\hxh\zangjingge\hxh_note\JVM.assets\image-20240208142611524.png)
- 将热点代码解释优化并存储在内存中，再次执行时直接调用（不需要再次解释编译）

##### 常见的JVM

![image-20240208142758388](E:\hxh\zangjingge\hxh_note\JVM.assets\image-20240208142758388.png)

- Oracle 制定了《Java虚拟机规范》，内容主要包含了Java虚拟机在设计和实现时需要遵守的规范，主要包含class字节码文件的定义,类和接口的加载和初始化、指令集等内容
- 《Java虚拟机规范》 是对虚拟机设计的要求，而不是对Java设计的要求，也就是说虚拟机可以运行在其他的语言比如：Groovy,Scala生成的class字节码文件之上

- 官网地址：https://docs.oracle.com/javase/specs/index.html

###### HotSpot的发展历程

![image-20240208143845520](E:\hxh\zangjingge\hxh_note\JVM.assets\image-20240208143845520.png)

## 字节码

##### JVM组成

![image-20240208144236758](E:\hxh\zangjingge\hxh_note\JVM.assets\image-20240208144236758.png)

##### 字节码文件组成

- 字节码文件保存了源代码编译之后的内容，以二进制的方式存储

- jclasslib 工具查看字节码文件
- Github地址：https://github.com/ingokegel/jclasslib

- ![image-20240208145219357](E:\hxh\zangjingge\hxh_note\JVM.assets\image-20240208145219357.png)

###### 基本信息

- ![image-20240208145307457](E:\hxh\zangjingge\hxh_note\JVM.assets\image-20240208145307457.png)

- 魔数-Magic魔数
  - 文件是无法通过文件扩展名来确定文件类型的，文件扩展名可以随意修改，不影响文件的内容
  - 软件使用文件的头几个字节（**文件头**）去校验文件的类型，如果软件不支持该中类型就会出错
  - Java字节码文件中，将文件头称为**魔数**  `CAFEBABE`
  - ![image-20240208145627757](E:\hxh\zangjingge\hxh_note\JVM.assets\image-20240208145627757.png)

- 主副版本号

  - 指的是编译字节码文件的JDK版本号，主版本号用来标识大版本号，JDK1.0-1.1使用了45.0~45.3,JDK1.2是46之后每升级一个大版本就加1;副版本号是当主版本号相同时作为区分不同版本的标识，一般只需要关心主版本号。
  - 作用：判断当前字节码版本和运行时的JDK是否兼容

  - 主板号 - 44 既可以知道大版本号

  - 问题：版本号冲突问题：

- 常量池
  - 避免相同的内容重复定义，节省空间