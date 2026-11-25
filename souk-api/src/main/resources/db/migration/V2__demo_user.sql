-- Vendeur de démonstration, en attendant l'authentification (Sprint 2).
-- À supprimer par une migration dédiée quand la connexion JWT sera en place (ticket #8).
INSERT INTO users (email, password_hash, full_name, phone, governorate)
VALUES ('demo@souk.tn', 'DEMO-NO-LOGIN', 'Vendeur Démo', '+216 20 000 000', 'TUNIS');
