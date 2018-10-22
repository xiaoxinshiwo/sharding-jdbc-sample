当当sharding-jdbc分库分表插件的样例  
**事项**:
1. 刷入脚本initial.sql  
2.代码生成：Run -> Edit Configurations -> + Maven commend line mybatis-generator:generate -e   
3.使用lombok插件  
4.无法使用自增主键,可以使用select uuid_short();
5.自定义分页算法：UuidShortShardingAlgorithm
