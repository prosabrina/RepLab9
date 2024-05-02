package dz.ibnrochd.master14.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.mapper.LigneConsultationMapper;
import dz.ibnrochd.master14.model.LigneConsultation;

@Service
public class LigneConsultationService {
	private final LigneConsultationMapper ligneConsultationMapper;

    @Autowired
    public LigneConsultationService(LigneConsultationMapper ligneConsultationMapper) {
        this.ligneConsultationMapper = ligneConsultationMapper;
    }

    public List<LigneConsultation> getLigneConsultations() {
    	List<LigneConsultation> ligneConsultations = ligneConsultationMapper.afficherToutesLigneConsultation();

        for (LigneConsultation ligneConsultation : ligneConsultations) {
            System.out.println(" * " + ligneConsultation.getId()+ 
            		" * " + ligneConsultation.getPosologie()+
            		" * " + ligneConsultation.getUnite_temps() +
            		" * " + ligneConsultation.getQuantite());
            if (ligneConsultation.getTraitement() != null) {
                System.out.println("	Nom du médicament: " + ligneConsultation.getTraitement().getNom());
            } else {
                System.out.println("Aucun traitement trouvé");
            }
            System.out.println("**********************************");
        }
        return ligneConsultations;
    }
}
