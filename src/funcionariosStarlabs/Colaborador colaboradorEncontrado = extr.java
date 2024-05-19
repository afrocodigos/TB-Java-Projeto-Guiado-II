Colaborador colaboradorEncontrado = extracted(colaborador1, arvoreColaboradores);
if (colaboradorEncontrado!= null) {
    colaboradorEncontrado.updateInfo("Ana Silva", "Desenvolvedora Sênior", 6000.0, area1, gerente1);
} else {
    System.out.println("Colaborador não encontrado.");
}