import { Header } from '../components/Header/Header';

type Props = {
    children: React.ReactNode;
}

export function MainLayout({ children }: Props) {
    return (
        <>
            <Header />
            <main>
                {children}
            </main>
        </>
    )
}