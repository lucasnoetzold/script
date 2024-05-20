package lucasnoetzold.script.model;

import io.smallrye.mutiny.tuples.Tuple2;

import java.util.Collection;

public interface ThoghtGroup {

    Collection< ThoughtConnection > getConnections();

    default Collection< Thought > getThoughts() {
        return getConnections().stream()
                       .map( ThoughtConnection::getThoughts )
                       .map( Tuple2::getItem2 )
                       .toList();
    }

    default Collection< Thought > getThoughtsSorted() {
        return getConnections().stream()
                       .map( ThoughtConnection::getThoughts )
                       .sorted()
                       .map( Tuple2::getItem2 )
                       .toList();
    }

}
