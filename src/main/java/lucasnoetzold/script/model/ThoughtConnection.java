package lucasnoetzold.script.model;

import io.smallrye.mutiny.tuples.Tuple2;

public interface ThoughtConnection extends Comparable< ThoughtConnection > {

    Tuple2< Thought, Thought > getThoughts();

    double getWeight();

    default int compareTo( ThoughtConnection other ) {
        return Double.compare( getWeight(), other.getWeight() );
    }

}
