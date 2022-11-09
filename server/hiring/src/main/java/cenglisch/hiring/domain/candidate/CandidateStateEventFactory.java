package main.java.cenglisch.hiring.domain.candidate;

import main.java.cenglisch.hiring.domain.candidate.event.*;

public final class CandidateStateEventFactory {
    public static CandidateEvent make(final CandidateId candidateId, final CandidateState candidateState) {
        return switch (candidateState) {
            case APPLICATION_ACCEPTED -> new CandidateApplicationAccepted(candidateId);
            case APPLICATION_APPROVED -> new CandidateApplicationApproved(candidateId);
            case APPLICATION_REJECTED -> new CandidateApplicationRejected(candidateId);
            case ACCEPTED -> new CandidateAccepted(candidateId);
            case REJECTED -> new CandidateRejected(candidateId);
        };
    }
}
