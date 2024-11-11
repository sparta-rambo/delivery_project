package com.delivery_project.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAIDescription is a Querydsl query type for AIDescription
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAIDescription extends EntityPathBase<AIDescription> {

    private static final long serialVersionUID = -1724015268L;

    public static final QAIDescription aIDescription = new QAIDescription("aIDescription");

    public final StringPath aiRequest = createString("aiRequest");

    public final StringPath aiResponse = createString("aiResponse");

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public QAIDescription(String variable) {
        super(AIDescription.class, forVariable(variable));
    }

    public QAIDescription(Path<? extends AIDescription> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAIDescription(PathMetadata metadata) {
        super(AIDescription.class, metadata);
    }

}
