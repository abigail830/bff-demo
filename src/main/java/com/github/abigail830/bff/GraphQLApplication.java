package com.github.abigail830.bff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphQLApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphQLApplication.class, args);
    }

//    private GraphQL graphQL;
//
//    @Autowired
//    QueryResolver queryResolver;
//
//    @Bean
//    public GraphQL graphQL() {
//        return graphQL;
//    }
//
//    @PostConstruct
//    public void init() throws IOException {
//        URL url = Resources.getResource("schema.graphqls");
//        String sdl = Resources.toString(url, Charsets.UTF_8);
//        GraphQLSchema graphQLSchema = buildSchema(sdl);
//        this.graphQL = GraphQL.newGraphQL(graphQLSchema).build();
//    }
//
//    private GraphQLSchema buildSchema(String sdl) {
//        TypeDefinitionRegistry typeRegistry = new SchemaParser().parse(sdl);
//        RuntimeWiring runtimeWiring = buildWiring();
//        SchemaGenerator schemaGenerator = new SchemaGenerator();
//        return schemaGenerator.makeExecutableSchema(typeRegistry, runtimeWiring);
//    }
//
//    private RuntimeWiring buildWiring() {
//        return RuntimeWiring.newRuntimeWiring()
//                .type(newTypeWiring("Query")
//                        .dataFetcher("bookById", queryResolver.getBookByIdDataFetcher()))
//                .type(newTypeWiring("Book")
//                        .dataFetcher("author", queryResolver.getAuthorDataFetcher()))
//                .build();
//    }
}
