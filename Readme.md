# Food Ordering System
An application built using the principles of hexagonal architecture and domain driven design
### Generate Dependency Graph
mvn com.github.ferstl:depgraph-maven-plugin:aggregate -DcreateImage=true -DreduceEdges=false -Dscope=compile "-Dincludes=com.food.ordering.system*:*"