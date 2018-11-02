#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public class ${NAME}Factory{
    
    private enum _SingletonEnum{
        factory;
        private ${type} instance;
        
        private _SingletonEnum(){
            //TODO 这里初始化instance
        }
        
        ${type} getInstance(){
            return instance;
        }
        
        
        
    }

    public static ${type} getInstance() {
        return  _SingletonEnum.factory.getInstance();
    }

     
}