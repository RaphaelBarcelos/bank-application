import { MainLayout } from '../layouts/MainLayout';
import './HomePage.css';
import { SignUpButton } from '../components/Buttons/Buttons';

export function HomePage() {
    return (
        <MainLayout>
            <div className='card-home'>
                <div className='home-title'>
                    <h1>Invista seu dinheiro com segurança</h1>
                    <p>tudo o que você precisa em um só lugar</p>
                </div>
                <div className='home-button'>
                    <SignUpButton />
                </div>
            </div>
            <div className='home-info'>
                <div className='card-info'>
                    <h1>Segurança é prioridade</h1>
                    <h2>Estamos aqui para dar suporte completo e personalizado aos nossos clientes</h2>
                    <div className='card-info-boxes'>
                        <div className='steal-support'>
                            <h4>Me Roubaram</h4>
                            <button>&gt;</button>
                        </div>
                        <div className='report-channel'>
                            <h4>Canal de Denúncia</h4>
                            <button>&gt;</button>
                        </div>
                        <div className='protection-center'>
                            <h4>Centro de Proteção</h4>
                            <button>&gt;</button>
                        </div>
                    </div>
                </div>
            </div>
        </MainLayout>
    )
}