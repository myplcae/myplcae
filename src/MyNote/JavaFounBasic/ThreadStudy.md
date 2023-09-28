java多线程二次感悟：

一、创建方式：三种：1、继承Thread类实现run方法；2、实现Runnable接口实现run方法；3、线程池ThreadPoolExecutor创建。

二、线程里的一些类的说明：1、sleep:sleep是配合Thread关键字使用的使线程休眠的方法，使用时需要添加参数（休眠时间）；sleep是Thread里边的方法

            		 2、wait:wait是配合锁使用的，不需要添加参数，取消wait状态时需要调用interrupt、notify、nitifyall等方法打断线程当前的wait状态，wait是Object里的方法

            		 3、notify、notifyall:方法作用是随机通知一个当前对象锁的阻塞队列中的线程,二者的区别是前者只通知一个线程，后者通知多个；这里都是Object里的方法

            		 4、join:join方法是Thread里边的方法，可以在线程执行的过程中强行插队，可以让几个线程一起交替执行

            		 5、yield:yield方法是Thread里的方法，降低此线程执行的优先级



